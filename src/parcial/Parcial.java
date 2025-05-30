package parcial;
import java.util.Scanner;

/**
 *
 * @author agus grandon
 */
public class Parcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Naves nave1 = new Naves ("alfa", 2, 1998);
        int opcion;
        boolean seguir = true;
        
        while(seguir){
            System.out.println("\n======== Menu de opciones ==========");
            System.out.println("1 Agregar nave (Exploración, Carguero o Crucero Estelar)");
            System.out.println("2 Mostrar todas las naves registradas.");
            System.out.println("3 Iniciar misión de exploración");
            System.out.println("4 Mostrar naves ordenadas por nombre (Comparable)");
            System.out.println("5 Mostrar naves ordenadas por año de lanzamiento descendente.");
            System.out.println("6 Mostrar naves ordenadas por capacidad de tripulación descendente.");
            System.out.println("7 Salir");
            System.out.println("Seleccione una opción: ");
            
            opcion = sc.nextInt(); 
            
            switch(opcion){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 7:
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
        
        sc.close(); 
    }
    
}
