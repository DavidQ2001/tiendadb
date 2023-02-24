package com.example.tienda2.Service;

import com.example.tienda2.Entity.Cliente;
import com.example.tienda2.Repository.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    IClienteDao clienteDao;

    public Cliente crearCliente (Cliente nuevoCliente){
        return clienteDao.save(nuevoCliente);
    }
}
