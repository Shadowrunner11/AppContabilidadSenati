/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Conexion {
    Connection con = null;
    private String uri = "jdbc:mysql://uabcjiqlpfjs9rvp:CHY8pqAkHULx5LSDV4jh@b5lxrxetukswgdl2y7s5-mysql.services.clever-cloud.com:3306/b5lxrxetukswgdl2y7s5";
    
    
    public  Connection conexion (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");            
            con=DriverManager.getConnection(uri, "uabcjiqlpfjs9rvp", "CHY8pqAkHULx5LSDV4jh");
            con.setAutoCommit(true);
            if(con != null){
                JOptionPane.showMessageDialog(null, "Conexion exitosa");           
            }else{
                JOptionPane.showMessageDialog(null, "Esta apagado");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }
    public void cerrarConexion(){
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo desconectar");
        }
    }
    /*public void create(){
        String SQL = "Select * empleados"
    }
*/
    public void filtrarDatosEmpleado(int valor){
        
        String SQL = "Select * from Empleado where ID="+valor;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            
            String[] datos = {"Nombres","Correo","Celular","Estado","Ruc"};
            
            
            //if(rs.next()==false){
            //    System.out.println("No hay datos");
                
            //}
            while(rs.next()){
                for(String dato: datos){
                    System.out.println(rs.getString(dato));
                }            
            }
  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }
    public void crearEmpleado(int ID,String Nombres,String Celular,String Direccion,String Correo,String Ruc,boolean Estado){
        try{
            String SQL = "insert into Empleado(ID,Nombres,Celular,Direccion,Correo,Ruc,Estado) values(?,?,?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(SQL);
            
            String[] texto = {Nombres,Celular,Direccion,Correo,Ruc};
            
            pst.setInt(1,ID);          
            int contador = 2;    
            for(String t:texto){
                pst.setString(contador,t);
                contador++;
            }
            pst.setBoolean(7,Estado);
            
            pst.execute();
                
            System.out.println("Exito");
            
        }catch(SQLException e){
            System.out.println("Error"+e.getMessage());
        }
    }
    public void actualizar(int ID,String Nombres,String Celular,String Direccion,String Correo,boolean Estado){
        try {
            String SQL = "Update Empleado set Nombres=?,Celular=?,Direccion=?,Correo=?,Estado=? where id="+ID;
            
            PreparedStatement pst = con.prepareStatement(SQL);
            
            String[] texto = {Nombres,Celular,Direccion,Correo};
                      
            int contador = 1;    
            for(String t:texto){
                pst.setString(contador,t);
                contador++;
            }
            pst.setBoolean(5,Estado);
            
            pst.execute();
                
            System.out.println("Exito");
            
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
    
}
