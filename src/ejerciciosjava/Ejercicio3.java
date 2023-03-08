
package ejerciciosjava;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio3 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        String mayus = toUpperCase(frase);
        String minus = toLowerCase(frase);
        
        System.out.println("MYUSCULA: "+ mayus);
        System.out.println("Minuscula: " + minus);
    }
}
