package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertarDatos {
    
    

    public static void InsertData(){

            Scanner leer = new Scanner(System.in);


        System.out.println("Ingrese su nombre");
        String Name = leer.nextLine();

        System.out.println("Ingrese su edad");
        int Age = leer.nextInt();

        //Decimos en que tabla de la base de datos va a almacenar los datos que le pase el usuario 
        //Esta es la connsulta

        String sqlinsert = "INSERT INTO usuarios (nombre, edad) VALUES(?,?)";



        try (Connection conn = ConexionDB.ConnectorDB();
        PreparedStatement pstm = conn.prepareStatement(sqlinsert))

        {
            pstm.setString(1, Name);
            pstm.setInt(2, Age);

            pstm.executeUpdate();

            System.out.println("Guardado con exito en la tabla. ");


        }catch (Exception e) {
            System.out.println("Error al insertar datos: " + e.getMessage());
        }
    }

}