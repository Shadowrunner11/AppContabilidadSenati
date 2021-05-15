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
public class Sueldo {
    private int horas;
    private double precio;
    private double sueldoBruto;
    private double descuento;
    private boolean estado;
    private double bonificacion;
    

    public Sueldo(int horas, double precio, boolean estado) {
        this.horas = horas;
        this.precio = precio;
        this.estado = estado;
        
    }
    public double getSueldoBruto(){
       sueldoBruto=horas*precio;
        return sueldoBruto;
    }
    public double getDescuento(double porcentaje){
        descuento=porcentaje*sueldoBruto;
        return descuento;
    }
    public double getBonificacion(){
        if (estado){
            bonificacion=sueldoBruto*0.07;
            return bonificacion;
        }else{
            return 000.00;
        }
    }
    public double getSueldoNeto(){
        return (sueldoBruto-descuento+bonificacion);
        
        }
    }
    

