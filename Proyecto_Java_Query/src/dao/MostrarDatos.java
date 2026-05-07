package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class MostrarDatos {
    

    public static void ShowData() throws SQLException 
    {
        String sqlSlecter = "SELECT * FROM usuarios";
            try (Connection con = ConexionDB.ConnectorDB()) 
            {
                    if (con != null) {
                        System.out.println("Conexion exitosa a la base de datos");
                    }

                try (Statement sttm = con.createStatement();
                ResultSet rs = sttm.executeQuery(sqlSlecter))
                {
                    while (rs.next()) {
                        String nombreDB = rs.getString("nombre");
                        int edadDB = rs.getInt("edad");

                        System.out.println("Nombre: "+nombreDB+ " | Edad: "+ edadDB);
                        
                    }

                    
                } catch (Exception e) {
                    System.out.println("Error al mostrar datos: " + e.getMessage());
                }
            }
                catch (Exception e) {
                    System.out.println("Error al conectar a la base de datos: " + e.getMessage());
                }
    }
}
