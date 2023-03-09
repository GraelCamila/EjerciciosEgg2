
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para indicar el limite");
        int limite = leer.nextInt();
        int suma = 0;
        
        while (suma < limite){
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = num + suma;
        }
        System.out.println("La suma de los numeros ingresados a superado el limite");
        System.out.println("LIMITE: "+limite+" SUMA: "+suma);
    }
}
