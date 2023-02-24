package com.example.tienda2.Service;

import com.example.tienda2.Entity.Producto;
import com.example.tienda2.Repository.IProductoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    IProductoDao productoDao;

    public Producto saveProducto(Producto producto){
        return  productoDao.save(producto);
    }

    public boolean saveProductos(List<Producto>productos){
        try {
            productoDao.saveAll(productos);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<Producto> obtenerProductosMenosresAlPrecio(Double precio){
        return productoDao.buscarProductosMenoresAlPrecio(precio);
    }

    public Producto encontarProductoNombre(String nombre){
        return productoDao.findByNombre(nombre).orElse(null);
    }
}
