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
public class Direccion {
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("^[a-zA-Z]{2,}[\\.]*[\\s]*([\\w-]+[\\.]*[\\s]*)+");
        Matcher mat= pat.matcher(direccion);
        return (mat.matches());
    }

    public String getDireccion() {
        return direccion;
    }
    
    
}
