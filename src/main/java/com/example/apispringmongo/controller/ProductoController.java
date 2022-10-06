package com.example.apispringmongo.controller;

import com.example.apispringmongo.model.Producto;
import com.example.apispringmongo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {


    @Autowired
    ProductoService productoService;

    @GetMapping("/listar")
    public ResponseEntity<List<Producto>>listar() {
        List<Producto> lista=productoService.findAll();
        return new ResponseEntity<>(lista,HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Producto> crearLista(@RequestBody Producto u) {
        return new ResponseEntity<>(productoService.save(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Producto> eliminarLista(@PathVariable Long id) {
        productoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    // actualizar
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Producto> actualizarLista(@PathVariable Long id, @RequestBody Producto c) {

        Producto listaActual = productoService.get(id);
        listaActual.setCod_pruducto(c.getCod_pruducto());
        listaActual.setCantidad(c.getCantidad());
        listaActual.setPrecio(c.getPrecio());
        listaActual.setProducto(c.getProducto());

        productoService.save(listaActual);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
