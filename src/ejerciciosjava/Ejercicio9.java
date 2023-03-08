
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra o frase");
        String frase = leer.nextLine();
        
        String sub = frase.substring(0,1);
        
        if (sub.toUpperCase().equals("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
        
    }
}
