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
public class Correo {
    private String correo;

    public Correo(String correo) {
        this.correo = correo;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"); 
        Matcher mat= pat.matcher(correo);
        return (mat.matches());
    }

    public String getCorreo() {
        return correo;
    }
    
    
}
