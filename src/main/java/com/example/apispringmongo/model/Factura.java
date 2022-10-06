/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.apispringmongo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Usuario
 */
@AllArgsConstructor
@Data
public class Factura {
    @Id  
    private Long id_factura;
    private Long id_cliente;
    private String  num_factura;
    private String fecha;

}
