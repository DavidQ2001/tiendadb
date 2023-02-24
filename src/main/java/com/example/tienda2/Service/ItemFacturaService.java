package com.example.tienda2.Service;

import com.example.tienda2.Entity.ITemFactura;
import com.example.tienda2.Repository.IItemFacturaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemFacturaService {

    @Autowired
    IItemFacturaDao itemFacturaDao;

    public ITemFactura guardarItemFactura(ITemFactura itemFactura ){
        return itemFacturaDao.save(itemFactura);
    }

    public ITemFactura obtenerItem(Integer id){
        return itemFacturaDao.findById(id).orElse(null);
    }
}
