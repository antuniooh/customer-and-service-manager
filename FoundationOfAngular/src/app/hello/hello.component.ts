import { Component } from '@angular/core'

@Component({
    selector: 'hello',//como ele será referecniado
    templateUrl: './hello.component.html'
})

export class HelloComponent{
    nome:string;
    clientes: Cliente[];

    constructor(){
        this.nome = "Antonio";
        let fulano = new Cliente("Fulano", 12)
        let cicrano = new Cliente("Cicrano", 12)

        this.clientes = [fulano, cicrano]
    }
}

class Cliente {

    constructor(
        public nome:string,
        public idade: number
    ){

    }
   

    
}