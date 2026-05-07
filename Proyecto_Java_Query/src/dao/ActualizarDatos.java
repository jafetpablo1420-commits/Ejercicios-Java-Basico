package dao;
import java.util.Scanner;
import java.sql.*;
public class ActualizarDatos {
    
    public static void UpdateData() {
        //Aqui va el codigo para actualizar datos de la base de datos
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el id del usuario que desea actualizar");
        int id = leer.nextInt();
        leer.nextLine(); // Limpiar el buffer
        System.out.println("Ingrese el nuevo nombre del usuario");
        String newName = leer.nextLine();
        System.out.println("Ingrese la nueva edad del usuario");
        int newAge = leer.nextInt();
        leer.nextLine(); // Limpiar el buffer


        String sqlUpdate = "UPDATE usuarios SET nombre = ?, edad = ? WHERE id = ?";

        try (Connection conn = ConexionDB.ConnectorDB();
             PreparedStatement pstmt = conn.prepareStatement(sqlUpdate)) {

            pstmt.setString(1, newName);
            pstmt.setInt(2, newAge);
            pstmt.setInt(3, id);

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Usuario actualizado exitosamente.");
            } else {
                System.out.println("No se encontró un usuario con ese id.");
            }

        } catch (Exception e) {
            System.out.println("Error al actualizar datos: " + e.getMessage());
        }


    }

    
}
