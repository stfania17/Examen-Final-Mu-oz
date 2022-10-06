package com.example.apispringmongo.service;

import com.example.apispringmongo.comoons.GenericServiceImpl;
import com.example.apispringmongo.model.Producto;
import com.example.apispringmongo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends GenericServiceImpl<Producto,Long> implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public CrudRepository<Producto, Long> getDao() {
        return productoRepository;
    }


}
