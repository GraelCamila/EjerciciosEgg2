
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        int result = num1 + num2;
        
        System.out.println("La suma de los numeros ingresados da " + result);
        
    }
    
}
