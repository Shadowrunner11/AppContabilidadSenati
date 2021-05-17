/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author User
 */
public class Nombre {
    private String nombre;

    public Nombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("([a-zA-Z]{3,}[\\s])([a-zA-Z]{3,}[\\s]{0,1})+");
        Matcher mat= pat.matcher(nombre);
        return (mat.matches());
    }

    public String getNombre() {
        return nombre;
    }
    
}
