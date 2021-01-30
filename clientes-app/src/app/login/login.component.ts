import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';
import { Usuario } from './usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  username:string;
  password:string;
  errors: string[];
  cadastrando: boolean;
  mensagemSucesso: string;

  constructor(
    private router: Router,
    private authService: AuthService
  ) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.authService
        .tentaLogar(this.username, this.password)
        .subscribe( response => {
          const access_token = JSON.stringify(response);
          localStorage.setItem('access_token', access_token)
          this.router.navigate(['/home'])
          console.log(response)
        }, errorResponse =>{
          this.errors = ["Usuário e/ou senha incorreto(s)."]
        })
    
  }

  preparaCadastrar(event){
    event.preventDefault()
    this.cadastrando = true
  }

  cancelaCadastro(){
    this.cadastrando = false
  }

  cadastrar(){
    const usuario = new Usuario();
    usuario.username = this.username
    usuario.password = this.password

    this.authService
    .salvar(usuario)
    .subscribe( response => {
      this.mensagemSucesso = "Cadastro realizado com sucesso. Efetue o login"
      this.errors = []
      this.cadastrando = false
      this.username = null
      this.password = null
    }, error => {
      this.errors = error.error.errors
      this.mensagemSucesso = null
    })
  }

}
