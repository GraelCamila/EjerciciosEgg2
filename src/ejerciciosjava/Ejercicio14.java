
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        String cambio;
        
        System.out.println("Ingrese la cantidad de euros");
        double euros = leer.nextDouble();
        
        System.out.println("¿A que desea convertir? Dolares, yenes o libras");
        cambio = leer.next();
        
        double retorno = conversion(euros, cambio);
        System.out.println(euros+" es igual a "+retorno+" "+cambio);
    }
    public static double conversion(double euros, String cambio){
        
        double conver =0;
        
        switch(cambio){
            case "dolares":
                conver = euros * 1.28611;
            case "yenes":
                conver = euros * 129.852;
            case "libras":
                conver = euros * 0.86;
        }
        return conver;
    }
}
