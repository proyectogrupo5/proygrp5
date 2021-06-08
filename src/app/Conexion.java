
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kenneth Marroquin
 */
public class Conexion {
    
    public static Connection getConexion(){
    String url = "jdbc:sqlserver://localhost:1433;"
            +"database=proyectofinalgrp5;"
            +"user=sa;"
            +"password=1ntegra98;";
    
    try{
        Connection con = DriverManager.getConnection(url);
        return con;     
    }catch(SQLException e){
        System.out.println(e.toString());
        return null;
    }
    }
    
}
