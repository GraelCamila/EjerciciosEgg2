
package ejerciciosjava;
//Para sacar la raiz cuadrada se puede importar:
//import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        //O solo colocar Math.sqrt();
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble de "+num+" es "+doble);
        System.out.println("El triple de "+num+" es "+triple);
        System.out.println("La raiz cuadrada de "+num+" es "+raiz);
    }
}
