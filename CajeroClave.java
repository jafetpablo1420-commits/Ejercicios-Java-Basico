package EstructurasCiclicas;
import java.util.Scanner;

public class CajeroClave {


    public static void main(String[] args) {

        int Clave, Intentos;

        Clave= 7;
        Intentos = 0;
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese la contraseña: ");
            int Pasword = leer.nextInt();
            




        while (Intentos<2 && Clave!=Pasword) {

            System.out.println("Contraseña invalida");
            Intentos = Intentos +1;
            System.out.println(Intentos+"/"+"3 Intentos");

            System.out.println("Ingrese la contraseña: ");
            Pasword = leer.nextInt();
            



            
        }
        if (Pasword==Clave){
            System.out.println("Binevenido");

        }

        else{
            System.out.println("Su tarjeta se ha bloqueado");
        }

        leer.close();

            
    }
}
