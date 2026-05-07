package dao;
import java.util.Scanner;
import java.sql.*;


public class Menu {

    //Donde se va a conectar es como el dni

    

    public static void main() throws SQLException{

        //Pedimos los datos del usuario
        
        Scanner leer = new Scanner(System.in);


        System.out.println("Que accio deseas realizar?");
        System.out.println("1. Guardar datos en la base de datos");
        System.out.println("2. Mostrar datos de la base de datos");
        System.out.println("3. Eliminar datos de la base de datos");
        System.out.println("4. Actualizar datos de la base de datos");

        int opcion = leer.nextInt();
        leer.nextLine();

        switch (opcion) {
            case 1:
                //Llamamos a la funcion para insertar datos en la base de datos

                InsertarDatos.InsertData();
                
                
                break;
            case 2:
                //Llamamos a la funcion para mostrar datos de la base de datos
                MostrarDatos.ShowData();
                break;
            case 3:
                //Llamamos a la funcion para eliminar datos de la base de datos
                EliminarDatos.DeleteData();
                break;
            case 4:
                //Llamamos a la funcion para actualizar datos de la base de datos
                ActualizarDatos.UpdateData();
                break;
                
            default:
                break;
        }


    





    

    


    }

    
}