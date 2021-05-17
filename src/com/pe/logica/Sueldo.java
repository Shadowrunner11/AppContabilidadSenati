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
public class Sueldo {
    private int horas;
    private double precio;
    private double sueldoBruto;
    private double descuento;
    private boolean estado;
    private double bonificacion;
    DecimalFormat df =new DecimalFormat("###.##");

    public Sueldo(int horas, double precio, boolean estado) {
        this.horas = horas;
        this.precio = precio;
        this.estado = estado;
        
    }
    public String getSueldoBruto(){
       sueldoBruto=horas*precio;
        return df.format(sueldoBruto);
    }
    public String getDescuento(double porcentaje){
        descuento=porcentaje*sueldoBruto;
        return df.format(descuento);
    }
    public String getBonificacion(){
        if (estado){
            
            bonificacion=sueldoBruto*0.07;
            return df.format(bonificacion);
            
        }else{
            return "000.00";
        }
    }
    public String getSueldoNeto(){
        double sueldoNeto=sueldoBruto-descuento+bonificacion;
        return df.format(sueldoNeto);
        
        }
    }
    

