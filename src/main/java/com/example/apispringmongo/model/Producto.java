package com.example.apispringmongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
@AllArgsConstructor
@Data
public class Producto {
    @Id
    private Long id_producto;
    private Long  id_factura;
    private String cod_pruducto;
    private String producto;
    private double precio;
    private int cantidad;




}
