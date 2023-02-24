package com.example.tienda2.Service;

import com.example.tienda2.Entity.Factura;
import com.example.tienda2.Repository.IFacturaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaSerice {

    @Autowired
    IFacturaDao facturaDao;

    public Factura nuevaFactura(Factura nuevaFactura){
        return facturaDao.save(nuevaFactura);
    }

    public  Factura obtenerFactura(Integer id){
        return  facturaDao.findById(id).orElse(null);
    }

}
