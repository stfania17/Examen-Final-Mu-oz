/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apispringmongo.service;

import com.example.apispringmongo.comoons.GenericServiceImpl;
import com.example.apispringmongo.model.Factura;
import com.example.apispringmongo.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class FacturaServiceImpl extends GenericServiceImpl<Factura,Long> implements FacturaService{

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public CrudRepository<Factura, Long> getDao() {
        return facturaRepository;
    }
    
}
