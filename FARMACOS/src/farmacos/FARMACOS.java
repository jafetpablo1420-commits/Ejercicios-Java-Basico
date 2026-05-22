/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package farmacos;
import java.util.Scanner;

/**
 *
 * @author daniel pablo perez
 */
public class FARMACOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        leer.nextLine();
        
        
        System.out.println("Que accion deseas realizar");
        System.out.println("1. Ingresar nuevo farmaco");
        System.out.println("2. Mostrar disponibles");
        System.out.println("3. Editar farmaco");
        System.out.println("4. Eliminar farmaco");
        
        int op = leer.nextInt();
        
        switch (op) {
            case 1:
                IngresarFAR.Insert();
                
                break;
            case 2:
                MostrarFAR.Showfar();
                break;
            case 3:
                EditarFAR.Update();
                break;
            case 4:
                EliminarFAR.Delete();
                break;
            default:
                throw new AssertionError();
        }
        // TODO code application logic here
    }
    
}
