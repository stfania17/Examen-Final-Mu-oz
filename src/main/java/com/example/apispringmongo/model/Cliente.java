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
public class Cliente {
    @Id
    private Long id_cliente;
    private String  dni;
    private String nombre;
    private String apellido;
    private String telefono;

}
