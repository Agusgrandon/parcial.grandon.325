package parcial;
import java.util.Scanner;

/**
 *
 * @author agus grandon
 */
public class Parcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("\n======== Menu de opciones ==========");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4) Salir");
            System.out.println("Seleccione una opción: ");
            
            opcion = sc.nextInt(); 
            
            switch(opcion){
                case 1:
                    System.out.println("opcion 1");
                case 2:
                    System.out.println("opcion 2");
                case 3:
                    System.out.println("opcion 3");
                case 4:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        
        sc.close(); 
    }
    
}
