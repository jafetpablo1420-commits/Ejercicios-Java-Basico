/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacos;
import java.sql.*;
/**
 *
 * @author daniel pablo perez
 */
public class MostrarFAR {
    
    
    static void Showfar(){
        String query = "SELECT * FROM farmacos";
        
        try {
            Connection con = new Conexion().Conect();
            
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            System.out.println("--Lista de farmacos--");
            while(rs.next()){
                
                int id = rs.getInt("idfarmacos");
                String Nameg = rs.getString("Nombre_generico");
                String Namec = rs.getString("Nombre_comercial");
                String wayfar = rs.getString("Forma_farmaceutica");
                int Concent = rs.getInt("Concentracion");
                int Stk = rs.getInt("Stock");
                String Fv = rs.getString("Fecha_vencimiento");
                int pc = rs.getInt("Precio");

                System.out.println("ID: "+id+ "| Nombre generico: "+ Nameg+ "| Nombre comercial: "+Namec+ "| Forma farmaceutica: "+ wayfar+ "| Concentracion: "+ Concent+ "| Stock: "+ Stk+ "| Fecha de vencimiento: "+ Fv+ "| Precio: "+ pc );

                
                
            }
        } catch (SQLException e) {
            System.err.println("Error "+ e.getMessage());
        }
    }
    
}
