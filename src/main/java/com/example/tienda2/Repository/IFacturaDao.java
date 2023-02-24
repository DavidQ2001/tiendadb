package com.example.tienda2.Repository;

import com.example.tienda2.Entity.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaDao extends CrudRepository<Factura,Integer> {
}
