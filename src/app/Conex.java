
package app;
import java.sql.*;

public class Conex {
    public Connection cadena_conexion(){
        Connection cn = null;
        
    try{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=proyectofinalgrp5","sa","1ntegra98");
} catch (Exception e){
}
    return cn;
    }
}
    

