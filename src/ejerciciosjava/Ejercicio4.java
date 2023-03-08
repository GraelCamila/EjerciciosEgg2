
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una cantidad de grados centigrados");
        double gradosC = leer.nextInt();
        
        double gradosF = 32 + (9 * gradosC/5);
        
        System.out.println(gradosC +"° centigrados es igual a "+gradosF);
        
    }
}
