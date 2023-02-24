package com.example.tienda2.Repository;

import com.example.tienda2.Entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteDao extends CrudRepository<Cliente,Integer> {
}
