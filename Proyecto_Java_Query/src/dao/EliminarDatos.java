package dao;
import java.util.Scanner;
import java.sql.*;

public class EliminarDatos {

    public static void DeleteData() throws SQLException {



        String sqlDelete = "DELETE FROM usuarios WHERE nombre = ?";

        try (Connection con = ConexionDB.ConnectorDB();
             PreparedStatement pstmt = con.prepareStatement(sqlDelete)) {

            // Pedimos el nombre del usuario a eliminar
            Scanner scanner = new Scanner(System.in);
            MostrarDatos.ShowData(); // Mostramos los datos antes de eliminar para que el usuario pueda elegir
            System.out.println("Ingrese el nombre del usuario a eliminar:");
            String nombreAEliminar = scanner.nextLine();

            // Establecemos el valor del parámetro en la consulta
            pstmt.setString(1, nombreAEliminar);

            // Ejecutamos la consulta de eliminación
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Usuario eliminado exitosamente.");
            } else {
                System.out.println("No se encontró un usuario con ese nombre.");
            }

        } catch (Exception e) {
            System.out.println("Error al eliminar datos: " + e.getMessage());
        }
    }
    
}
