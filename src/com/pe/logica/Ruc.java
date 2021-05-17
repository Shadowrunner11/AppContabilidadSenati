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
public class Ruc {
    private String ruc;

    public Ruc(String ruc) {
        this.ruc = ruc;
    }
    public boolean Validar(){
        Pattern pat= Pattern.compile("[\\d]{10}");
        Matcher mat= pat.matcher(ruc);
        return (mat.matches());
    }

    public String getRuc() {
        return ruc;
    }
    
}
