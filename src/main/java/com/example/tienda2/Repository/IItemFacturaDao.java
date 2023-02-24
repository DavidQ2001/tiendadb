package com.example.tienda2.Repository;

import com.example.tienda2.Entity.ITemFactura;
import org.springframework.data.repository.CrudRepository;

public interface IItemFacturaDao  extends CrudRepository<ITemFactura,Integer> {
}
