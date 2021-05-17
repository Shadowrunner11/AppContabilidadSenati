/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.logica;

import java.text.DecimalFormat;

/**
 *
 * @author User
 */
public class PruebasLogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println((new Nombre("Juan Perez")).Validar());
        //DecimalFormat df =new DecimalFormat("###.##");
        //Sueldo sueldo=new Sueldo(11,23.5, true);
        //System.out.println(df.format(sueldo.getSueldoBruto()));
        //System.out.println(df.format(sueldo.getDescuento(0.13)));
        //System.out.println(df.format(sueldo.getBonificacion()));
        //System.out.println(df.format(sueldo.getSueldoNeto()));
    }
    
}
