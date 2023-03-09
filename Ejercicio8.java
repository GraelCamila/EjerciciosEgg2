
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra de 8 carcateres");
        String frase = leer.nextLine();
        
        int largo = frase.length();
        
        if (largo==8){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
