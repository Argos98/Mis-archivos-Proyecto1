/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa.celestial.software.db;

import java.sql.*;

/**
 *
 * @author Osvaldo Salazar
 */
public class Conexion {

    Connection conn;
    Statement stmt;
    ResultSet rs;
String mensaje;
    public void sqlServer() {//Es es solamente una guia 
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-IL7OV8N\\MSSQLSERVER01;DatabaseName= BD_proyecto;integratedsecurity = true";
            conn = DriverManager.getConnection(connectionUrl);
            stmt = conn.createStatement();

            rs = stmt.executeQuery("SELECT * FROM Cliente");
            while (rs.next()) {
                System.out.println(rs.getString("telefono"));
            }

        } catch (Exception ex) {
            System.out.println("error" + ex.getMessage());
        }

    }

    public String registrarProducto (String nombreProducto, String codigo, String descripcion){
     try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-IL7OV8N\\MSSQLSERVER01;DatabaseName= BD_proyecto;integratedsecurity = true";
            conn = DriverManager.getConnection(connectionUrl);
            stmt = conn.createStatement();

            rs = stmt.executeQuery("INSERT INTO producto (nombreProducto, codigo, descripcion)"
                    + "Values (' "+nombreProducto+ " ', ' "+ codigo+" ', ' "+ descripcion+ " ')");
         while(rs.next()){
         mensaje= "Se guardo efectivamente el producto";
         }

        } catch (Exception ex) {
           mensaje=("error  " + ex.getMessage());
        }
    
    return mensaje;
    }
    
    
}
