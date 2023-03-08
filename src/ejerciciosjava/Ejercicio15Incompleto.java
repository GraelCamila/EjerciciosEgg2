
package ejerciciosjava;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio15Incompleto {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int[] num = new int[100];
        int buscar = 0;
        for (int i = 0; i < 100; i++) {
            num[i] = (int)Math.floor(Math.random()*100);
        }
        
        
        
        
        
        for (int i = 100; i < 0; i--) {
            
            //Arrays.sort(num[i], Collections.reverseOrder());
            
            
            if (buscar < num[i]){
                System.out.println(num[i]);
                buscar = buscar +1;
            }
        }
        
    }
}
