package com.example.tienda2.Repository;

import com.example.tienda2.Entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductoDao extends CrudRepository<Producto,Integer> {

    @Query(value = "select * from productos where precio <= 5000",nativeQuery = true)
    public List<Producto> buscarProductosMenoresAlPrecio(double precio);

    public Optional<Producto> findByNombre(String nombre);

}
