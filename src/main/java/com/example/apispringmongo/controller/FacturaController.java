/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apispringmongo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apispringmongo.model.Factura;
import com.example.apispringmongo.service.FacturaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Usuario
 */
@RestController
@RequestMapping("/api/producto")
public class FacturaController {
    @Autowired
    FacturaService facturaService;

    @GetMapping("/listar")
    public ResponseEntity<List<Factura>>listar() {
        List<Factura> lista=facturaService.findAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Factura> crearLista(@RequestBody Factura u) {
        return new ResponseEntity<>(facturaService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Factura> eliminarLista(@PathVariable Long id) {
        facturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    // actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Factura> actualizarLista(@PathVariable Long id, @RequestBody Factura c) {

        Factura listaActual = facturaService.get(id);
        listaActual.setNum_factura(c.getNum_factura());
        listaActual.setFecha(c.getFecha());
        facturaService.save(listaActual);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
