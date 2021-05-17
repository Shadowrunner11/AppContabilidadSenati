/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.conexion;

import java.sql.Connection;

/**
 *
 * @author User
 */
public class Pruebas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion pruebaCon = new Conexion();
        pruebaCon.conexion();
        pruebaCon.filtrarDatosEmpleado(1234567890);
        //pruebaCon.conexion();
        //pruebaCon.crearEmpleado(1421,"PEPITO","Jr. Poder","942141","fefe@defe.com","1421",false);
        //pruebaCon.conexion();
        //pruebaCon.actualizar(1421,"rosita","Jr. Poder","942141","fefe@defe.com",false);
    }  
}
