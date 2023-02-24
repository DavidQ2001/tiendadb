package com.example.tienda2.Controller;

import com.example.tienda2.Entity.Factura;
import com.example.tienda2.Service.FacturaSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/facturas")
public class FacturaController {


    @Autowired
    FacturaSerice facturaSerice;

    @PostMapping(value = "/crear")
    public Factura crearFactura(@RequestBody Factura factura) {
        return facturaSerice.nuevaFactura(factura);
    }

    @GetMapping(value = "/obtener")
    public Factura obtenerFactura(Integer id) {
        return facturaSerice.obtenerFactura(id);
    }

}
