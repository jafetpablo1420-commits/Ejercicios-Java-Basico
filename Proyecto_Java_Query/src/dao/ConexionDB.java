package dao;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionDB {

    public static Connection ConnectorDB() {

        final String URL= "jdbc:mysql://localhost:3306/usuarios";
        final String USER= "root";
        final String PASS= "Alastor18";
        try {
            return DriverManager.getConnection(URL,USER, PASS);
            
            
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            return null;
        }
    }
    
}
