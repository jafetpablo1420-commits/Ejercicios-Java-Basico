

import java.util.Scanner;

public class SistemaCreditosPro {

    public static void main(String[] args) {

        iniciarSistema();



        
    }

    public static void iniciarSistema() {

        //Registro o inicio de sesion de usuario

        String UserName = "Jafet";
        int Pasword = 666;



        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvendo");
        System.out.println("1. Iniciar sesion");
        System.out.println("2. Salir");

        int opcion = leer.nextInt();
        leer.nextLine();


        switch (opcion) {
            case 1:

                System.out.println("Nombre de usuario: ");
                String NombreUsuario = leer.nextLine();

                System.out.println("Contraseña: ");
                int Contraseña = leer.nextInt();

              

                if(NombreUsuario.equals(UserName) && Contraseña==Pasword ){

                    //Definimos las variables

                    int creditos = 50;
                    int Bitcoinprize =10;
                    int Usbkiller =15;
                    int VirusMlavado =30;
                    int item;

                    System.out.println("--Mercado del Mal--");
                    System.out.println("Bitcoin");
                    System.out.println("Usb Killer");
                    System.out.println("Virus Malvado");
                    System.out.println("Salir");
                    
                    //Pedimos la opcion de item a visualizar
                    item = leer.nextInt();

                    //Mostramos la interfaz de compra en cada caso
                    switch (item) {

                        //Interfaz de compra-Bitcoin
                        case 1:
                            int Eleccion;

                            System.out.println("$10 -Unidad de bitcoin");
                            System.out.println("1.-Comprar");
                            System.out.println("2.-Regresar");
                            Eleccion = leer.nextInt();

                            
                            //El usuario elige comprar o regresar
                            switch (Eleccion) {
                                case 1:
                                    //Compra de item
                                    if(creditos>=Bitcoinprize){
                                        creditos= creditos-Bitcoinprize;
                                        System.out.println("Compra Exitosa");
                                        System.out.println("CReditos restantes: "+ creditos);
                                    }
                                    
                                    break;
                                case 2:
                                    //Regresa al menu de items

                                    break;
                            
                                default:
                                    break;
                            }
                            break;

                            //Interfaz de compra_USB killer
                        case 2:
                            int EleccionC2;
                            System.out.println("$15- Unidad de USB killer");
                            System.out.println("1.-Comprar");
                            System.out.println("2.-Regresar");
                            EleccionC2= leer.nextInt();

                            //El usuario elige comprar Regresar
                            switch (EleccionC2) {

                                
                                case 1:
                                    if(creditos>=Usbkiller){
                                        creditos=creditos-Usbkiller;
                                        System.out.println("Compra Exitosa");
                                        System.out.println("CReditos restantes: "+ creditos);

                                    }
                                    else{
                                        System.out.println("Creditos insuficientes");
                                    }
                                        

                                    
                                    break;
                                case 2:
                                    //Regresa al menu de items
                                break;
                            
                                default:
                                    break;
                            }


                            break;
                            //Interfaz de compra-Virus Malvado
                        case 3:
                            int EleccionC3;

                            System.out.println("$10 -Unidad de bitcoin");
                            System.out.println("1.-Comprar");
                            System.out.println("2.-Regresar");
                            EleccionC3 = leer.nextInt();

                            
                            //El usuario elige Comprar o Regresar
                            switch (EleccionC3) {
                                case 1:
                                    if (creditos>=VirusMlavado) {

                                        creditos=creditos-VirusMlavado;
                                        System.out.println("Compra Exitosa");
                                        System.out.println("CReditos restantes: "+ creditos);
                                    }
                                    else{
                                        System.out.println("Creditos insuficientes..");
                                    }

                                    

                                    
                                    break;

                                case 2:
                                    //Regresa al menu de items
                                    break;
                            
                                default:
                                    break;
                            }




                            break;
                        case 4:
                            System.out.println("Saliste del Programa");

                            break;

                        default:
                            break;
                    }


                }
                else{
                    System.out.println("Contraseña incorrecta");
                }
            
                

                

                


                break;
            case 2:
                System.out.println("El sistema se ha cerrado");


                break;
        
            default:
                break;
        }

        

        


        


    
        
    } {
    
        
    }
    
}
