/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacos;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;
/**
 *
 * @author daniel pablo perez
 */
public class IngresarFAR {
    
   

    
    static void Insert(){
        
        Scanner leer = new Scanner(System.in);        
        leer.nextLine();
        
        System.out.println("Ingrese el nombre generico");
        String Nombre_generico= leer.nextLine();
        System.out.println("Ingrese el nombre comercial");
        String Nombre_comercial= leer.nextLine();
        System.out.println("Ingrese la forma farmaceutica (capsula, pastilla, inyeccion)");
        String Forma_farmaceutica= leer.nextLine();
        System.out.println("Ingrese la concentracion");
        int Concentracion= leer.nextInt();
        System.out.println("Ingrese el stock");
        int Stock = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese la fecha de caducidad D/M/Y");
        String Fecha_vencimineto = leer.nextLine();
        System.out.println("Ingrese el precio");
        int Precio = leer.nextInt();

        

        

        
        
        
        
        String sqlinsert = "INSERT INTO farmacos (Nombre_generico, Nombre_comercial, Forma_farmaceutica, Concentracion, Stock, Fecha_vencimiento, Precio) VALUES(?,?,?,?,?,?,?)";

        
        try {Connection con = new Conexion().Conect();
        
        PreparedStatement pst = con.prepareStatement(sqlinsert);
        
        pst.setString(1, Nombre_generico);
        pst.setString(2, Nombre_comercial);
        pst.setString(3, Forma_farmaceutica);
        pst.setInt(4, Concentracion);
        pst.setInt(5, Stock);
        pst.setString(6, Fecha_vencimineto);
        pst.setInt(7, Precio);
        
        pst.executeUpdate();
        
            
        } catch (SQLException e) {
            System.err.println("Error al ingresar los datos"+ e.getMessage());
        }
        
        
        
    }
    
}
