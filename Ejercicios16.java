
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicios16 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        System.out.println("¿Que numero desea buscar?");
        int num = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*10);
            System.out.print(vector[i]+ ", ");
            if (num == vector[i]) {
                contador = contador+1;
            }
        }
        
        System.out.println("");
        
        if (contador != 0) {
            System.out.print("El numero ingresado se hayó "+ contador);
            if (contador>1) {
                System.out.println(" veces");
            }else {
                System.out.println(" vez");
            }
            for (int i = 0; i < n; i++) {
                if (vector[i] == num) {
                    System.out.println("En la posicion "+i);
                }
            }
        }else{
            System.out.println("El numero ingresado no se encuentra dentro del vector");
        }
    }
}
