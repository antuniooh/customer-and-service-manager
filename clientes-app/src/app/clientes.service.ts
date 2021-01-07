import { Injectable } from '@angular/core';
import { Cliente } from './clientes/cliente';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ClientesService {

  constructor(private http:HttpClient) { }

  salvar (cliente: Cliente) : Observable<Cliente>{ // espera a ação terminar, mas não bloqueia o fluxo
    return this.http.post<Cliente>('http://localhost:8080/api/clientes', cliente)
  }

  getCliente() :Cliente{
    let cliente: Cliente = new Cliente(); 
    cliente.cpf="AAA";
    cliente.nome="AAAAAAA";
    return cliente
  }
}
