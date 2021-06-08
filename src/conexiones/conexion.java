package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;


public class conexion {
    
    static Connection contacto = null;
    public static String usuario;
    public static String password;
    public static boolean status = false;
    
    public static Connection getConexion(){
        
        status = false;
     String url = "jdbc:sqlserver://localhost:1433;databaseName=proyectofinalgrp5"; 
     try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     
     } catch (ClassNotFoundException e ){
     
    
     JOptionPane.showMessageDialog(null,"No se pudo establecer la conexion... revisar Driver" + e.getMessage(),
     "Error de Conexion", JOptionPane.ERROR_MESSAGE);
 
    
    }
     try{
         contacto = DriverManager.getConnection(url,conexion.usuario, conexion.password);
         status = true;
     }catch (SQLException e){
          JOptionPane.showMessageDialog(null,"Error" + e.getMessage(),
     "Error de Conexion", JOptionPane.ERROR_MESSAGE);
 
         
     }
      return contacto;
      
     }
    
    
    public static void setcuenta(String usuario, String password){
        conexion.usuario =usuario;
        conexion.password =password;
        
        
    }
    
    public static boolean getstatus(){
        return status;
                
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement deClara;
       
        try{
            deClara = con.createStatement();
            ResultSet respuesta = deClara.executeQuery(consulta);
            return respuesta;
                  
        }catch (SQLException e){
             JOptionPane.showMessageDialog(null,"Error" + e.getMessage(),
     "Error de Conexion", JOptionPane.ERROR_MESSAGE);
            
        }
        return null;
    }

    public static void setcuenta(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
