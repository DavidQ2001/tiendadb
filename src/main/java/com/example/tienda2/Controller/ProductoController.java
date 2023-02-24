package com.example.tienda2.Controller;

import com.example.tienda2.Entity.Producto;
import com.example.tienda2.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/productos")
public class ProductoController  {
    @Autowired
    ProductoService productoService;

    @PostMapping(value = "/guardar")
    public Producto guardarProducto(@RequestBody Producto producto){
        return productoService.saveProducto(producto);

    }

    @PostMapping(value = "/guardar-todo")
    public boolean guardarProductos(@RequestBody List<Producto> producto){
        return productoService.saveProductos(producto);

    }

    @GetMapping("/obtener-productos-menores")
    public List<Producto> productosMenoresPrecio(Double precio){
        return productoService.obtenerProductosMenosresAlPrecio(precio);

    }

    @GetMapping(value = "/obtener-nombre")
    public Producto encontarPorNombre(String nombre){
        return productoService.encontarProductoNombre(nombre);
    }
}
