
package app;

import java.sql.*;
import java.sql.Connection;

public class Datos extends Conex{
    Connection cn=cadena_conexion();
    public int probarconexion(){
        int conexion=0;
        try{
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            ps = cn.prepareStatement("Select Count(*) from login");
            rs=ps.executeQuery();
            if (rs.next()){
                conexion=1;
            }
        } catch (Exception e){
            
        }return conexion;
    }
    public int logeo(String usuario, String clave){
        int ingreso=0;
        try{
            PreparedStatement ps=null;
            ResultSet rs = null;
            ps = cn.prepareStatement("exec usp_login ?,?");
            ps.setString(1, usuario);
            ps.setString(2,clave);
            rs=ps.executeQuery();
            if (rs.next()){
                
                ingreso =Integer.parseInt(rs.getString(1));
            }
        }catch (Exception e){
            
        }return ingreso;
    }
}
