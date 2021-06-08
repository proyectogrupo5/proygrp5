/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexiones;

/**
 *
 * @author yener
 */
import java.sql.CallableStatement;
import java.sql.SQLException;

public class procedimiento {
    
    public static void EstradaArticulo(int a, String b)throws SQLException{
        CallableStatement entrada = conexion.getConexion().prepareCall("{call SP_CATEGORIA(?,?)}");
        entrada.setInt(1, a);
        entrada.setString(2, b);
        
        entrada.execute();
    }
    
    public static void EliminarArticulo(int a)throws SQLException{
        CallableStatement entrada = conexion.getConexion().prepareCall("{call EliminarArticulo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarArticulo(int a)throws SQLException{
        CallableStatement entrada = conexion.getConexion().prepareCall("{call BuscarArticulo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }}