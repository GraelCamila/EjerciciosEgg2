
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion;
        String sal;
        sal = "N";
        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija una opcion:");
            
            opcion = leer.nextInt();
        
            switch (opcion){
                case 1:
                    int suma = num1 + num2;
                    System.out.println("La suma de los numeros ingresados es " + suma);
                    leer.nextLine();
                    System.out.println("Presione Enter para continuar");
                    leer.nextLine();
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("La resta de los numeros ingresados es " + resta);
                    leer.nextLine();
                    System.out.println("Presione Enter para continuar");
                    leer.nextLine();
                    break;
                case 3:
                    int multi = num1 * num2;
                    System.out.println("La multiplicacion de los numeros ingresados es "+ multi);
                    leer.nextLine();
                    System.out.println("Presione Enter para continuar");
                    leer.nextLine();
                    break;
                case 4:
                    double div = num1 / num2;
                    System.out.println("La division de los numeros ingresados es " + div);
                    leer.nextLine();
                    System.out.println("Presione Enter para continuar");
                    leer.nextLine();
                    break;
                case 5:
                    leer.nextLine();
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    sal = leer.nextLine();
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
                    leer.nextLine();
                    System.out.println("Presione Enter para continuar");
                    leer.nextLine();
            }
            //if (opcion == 5){
                //System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    //sal = leer.nextLine();
            //}
        } while (sal.equals("N"));
    }
}