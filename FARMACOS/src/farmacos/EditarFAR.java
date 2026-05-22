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
public class EditarFAR {
    
    static void Update(){
        Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese el ID del fármaco a modificar:");
    int id = leer.nextInt();
    leer.nextLine(); // Limpiar buffer
    
    System.out.println("Ingrese el nuevo stock:");
    int nuevoStock = leer.nextInt();
    
    String sqlupdate = "UPDATE farmacos SET Stock = ? WHERE idfarmacos = ?";
    
    try (Connection con = new Conexion().Conect()) {
        PreparedStatement pst = con.prepareStatement(sqlupdate);
        pst.setInt(1, nuevoStock);
        pst.setInt(2, id);
        
        int filasAfec = pst.executeUpdate();
        if (filasAfec > 0) {
            System.out.println("¡Actualización exitosa!");
        } else {
            System.out.println("No se encontró el fármaco con ese ID.");
        }
    } catch (SQLException e) {
        System.err.println("Error al modificar: " + e.getMessage());
    }

    }
    
    
    
}
