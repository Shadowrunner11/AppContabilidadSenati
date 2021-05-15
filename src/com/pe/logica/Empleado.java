/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.logica;

/**
 *
 * @author User
 */
public class Empleado {
    private String Nombre;
    private String Direccion;
    private String Celular;
    private String Correo;
    private String Ruc;
    private boolean Estado;

    public Empleado(String Nombre, String Direccion, String Celular, String Correo, String Ruc, boolean Estado) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.Correo = Correo;
        this.Ruc = Ruc;
        this.Estado = Estado;
    }
    
    
}
