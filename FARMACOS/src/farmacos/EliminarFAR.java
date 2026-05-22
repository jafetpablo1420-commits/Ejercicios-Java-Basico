/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacos;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author daniel pablo perez
 */
public class EliminarFAR {
    
    static void Delete(){
        Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese el ID del fármaco que desea eliminar:");
    int id = leer.nextInt();
    
    String sqldelete = "DELETE FROM farmacos WHERE ID_Farmaco = ?";
    
    try (Connection con = new Conexion().Conect()) {
        PreparedStatement pst = con.prepareStatement(sqldelete);
        pst.setInt(1, id);
        
        int filasAfec = pst.executeUpdate();
        if (filasAfec > 0) {
            System.out.println("Fármaco eliminado correctamente.");
        } else {
            System.out.println("No se encontró ningún fármaco con ese ID.");
        }
    } catch (SQLException e) {
        System.err.println("Error al eliminar: " + e.getMessage());
    }
    }
    
}
