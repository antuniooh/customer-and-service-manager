package io.github.antuniooh.service;

import io.github.antuniooh.repository.ClientesRepository;
import model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    private ClientesRepository repository;

   /* @Autowired
    public void setRepository(ClientesRepository repository){
        this.repository = repository;
    }*/

    //@Autowired
    public ClientesService(ClientesRepository repository){
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);
        this.repository.persistir(cliente);
    }

    public void validarCliente(Cliente cliente){

    }
}
