package com.example.holaMundo.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Saludo implements Serializable {

    //Atributos
    private String remitente;
    private String mensaje;
    private String destinatario;



}
