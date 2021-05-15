/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Conexion {
    Connection con;
    private String uri = "jdbc:mysql://uabcjiqlpfjs9rvp:CHY8pqAkHULx5LSDV4jh@b5lxrxetukswgdl2y7s5-mysql.services.clever-cloud.com:3306/b5lxrxetukswgdl2y7s5";
    public Conexion (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con=DriverManager.getConnection(uri, "uabcjiqlpfjs9rvp", "CHY8pqAkHULx5LSDV4jh");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public Connection getConexion(){
        return con;
    }
}
