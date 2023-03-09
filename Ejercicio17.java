
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0;
        
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*10000);
            //System.out.println(vector[i]);
        }
        for (int i = 0; i < n; i++) {
            if (vector[i]<10 && vector[i]>=0) {
                uno = uno + 1;
            } else if(vector[i]< 100 && vector[i]>=10){
                dos = dos + 1;
            }else if(vector[i]< 1000 && vector[i]>=100){
                tres = tres + 1;
            }else if(vector[i]< 10000 && vector[i]>=1000){
                cuatro = cuatro + 1;
            }else if(vector[i]<= 99999 && vector[i]>=10000){
                cinco = cinco + 1;
            }
        }
        System.out.println("De una cifra: "+ uno);
        System.out.println("De dos cifras: "+ dos);
        System.out.println("De tres cifras: "+ tres);
        System.out.println("De cuatro cifras: "+ cuatro);
        System.out.println("De cinco cifras: "+ cinco);
    }
}
