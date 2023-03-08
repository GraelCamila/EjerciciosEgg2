
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        String cadena;
        int correcto = 0, incorrecto = 0;
        
        System.out.println("Ingrese una cadena con las siguientes caracteristicas:");
            System.out.println("- No de superar los 5 carcateres");
            System.out.println("- Debe inicar con X");
            System.out.println("- Debe terminar con O");
        do {
            
            System.out.println("Para finalizar ingrese &&&&&");
            cadena = leer.nextLine();
            
            if (cadena.length() <= 5 && cadena.substring(0,1).equals("X") && cadena.substring(4,5).equals("o")) {
                correcto = correcto + 1;
            }else {
                incorrecto = incorrecto +1;
            }
            System.out.println("Ingrese otra cadena con las mismas caracteristicas");
        } while (!cadena.equals("&&&&&"));
        
        incorrecto = incorrecto - 1;
        
        System.out.println("Lecturas correctas: "+ correcto);
        System.out.println("Lecturas incorrectas: "+ incorrecto);
        
    }
}
