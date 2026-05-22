/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacos;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author daniel pablo perez
 */
public class Conexion {

    final static String URL= "jdbc:mysql://localhost:3306/farmacia";
    final static String USER = "root";
    final static String PASSWORD = "Alastor18";
    public static Connection Conect()  {
        
        try {
            return DriverManager.getConnection(URL,USER,PASSWORD);
            
            
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos"+ e.getMessage());
        }
        return null;
    }
    
}
