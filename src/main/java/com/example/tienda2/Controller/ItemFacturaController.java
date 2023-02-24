package com.example.tienda2.Controller;

import com.example.tienda2.Entity.ITemFactura;
import com.example.tienda2.Service.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/item")
public class ItemFacturaController {

    @Autowired
    ItemFacturaService itemFacturaService;

    @PostMapping(value = "/guardar")
    public ITemFactura guardarItem(@RequestBody  ITemFactura item){
        return itemFacturaService.guardarItemFactura(item);

    }

    @GetMapping(value = "/buscar-item")
    public ITemFactura obtenerFactura(Integer id){
        return itemFacturaService.obtenerItem(id);
    }
}
