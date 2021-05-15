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
public class Celular {
    private String celular;

    public Celular(String celular) {
        this.celular = celular;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("[\\d]{9}");
        Matcher mat= pat.matcher(celular);
        return (mat.matches());
    }

    public String getCelular() {
        return celular;
    }
    
}
