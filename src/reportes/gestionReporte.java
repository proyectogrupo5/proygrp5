
package reportes;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JInternalFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class gestionReporte {
    
    
public void reportePedido() throws SQLException, JRException 
    {
        Connection cn;
        cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=proyectofinalgrp5","sa","1ntegra98");
        JasperReport reporte = null;
        reporte = (JasperReport) JRLoader.loadObjectFromFile("reportePedido.jasper");
        JasperPrint imp = JasperFillManager.fillReport(reporte, null, cn);
        
        JasperViewer ver = new JasperViewer(imp);
        ver.setTitle("PEDIDOS");
        ver.setVisible(true);         
    }
}


