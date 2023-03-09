
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado");
        int num = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        
        for (int i = 0; i < num-2; i++) {
            for (int j = 0; j < num; j++) {
                if (j == 0 || j == num-1) {
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
        for (int i = 0; i < num; i++) {
            System.out.print("* ");
        }
        
        System.out.println("");
    }
}
