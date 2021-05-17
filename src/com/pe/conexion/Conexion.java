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
import javax.swing.JRadioButton;
import javax.swing.JTextField;
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
                System.out.println("Conexion exitosa");           
            }else{
                JOptionPane.showMessageDialog(null, "Está apagado");
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
    public void filtrarDatosEmpleado(String valor, JTextField caja1, JTextField caja2, 
            JTextField caja3, JTextField caja4,JRadioButton soltero, JRadioButton casado ){
        
        String SQL = "Select * from Empleado where Ruc="+valor;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            
            String[] datos = {"Nombres","Correo","Celular","Direccion", "Estado"};
            JTextField[] cajas={caja1, caja2, caja3, caja4};
            
            //if(rs.next()==false){
            //    System.out.println("No hay datos");
                
            //}
            if(rs.next()){
                for(int i =0; i<4; i++){
                    cajas[i].setText(rs.getString(datos[i]));
                } 
                if (rs.getBoolean(datos[4])){
                    casado.setSelected(true);
                    soltero.setSelected(false);
                }else{
                    casado.setSelected(false);
                    soltero.setSelected(true);
                }
            }else{
                System.out.println("No hay datos");
                for (JTextField caja: cajas){
                    caja.setText(null);
                }
            }
  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            
        }
        
    }
    public void filtrarDatosEmpleado(int valor){
        
        String SQL = "Select * from Empleado where ID="+valor;
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            
            String[] datos = {"Nombres","Correo","Celular","Estado","Direccion"};
            
            
            //if(rs.next()==false){
            //    System.out.println("No hay datos");
                
            //}
            if(rs.next()){
                for(int i =0; i<5; i++){
                    System.out.println(rs.getString(datos[i]));
                }            
            }else{
                System.out.println("No hay datos");
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
