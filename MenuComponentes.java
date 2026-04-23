package EstructurasCiclicas;
import java.util.Scanner;

public class MenuComponentes 
{

    public  void main () {

        int opcion;

        Scanner leer = new Scanner(System.in);

        

        do{
        System.out.println("--Tienda de componentes--");
        System.out.println("1. --Monitor--");
        System.out.println("2. --Tarjeta Madre--");
        System.out.println("3. --RAM--");
        System.out.println("4. --Salir--");

        opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("$1500 c/u");
                
                break;

            case 2:
                System.out.println("$500 c/u");
                break;
            case 3:
                System.out.println("$800 c/u");
                break;
            case 4:
                System.out.println("¡Se ha cerrado el sistema!");
                break;
        
            default:
                break;
        }

        }
        while(opcion!=4);


        leer.close();
        
    }
    


}
