
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio19Incompleto {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        System.out.println("Ingrese los valores a la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]<0){
                    System.out.print(matriz[i][j]+ " ");
                } else {
                    System.out.print(" "+matriz[i][j]+" ");
                }
            }
            System.out.println("");
        }
        System.out.println("----------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[j][i]<0){
                    System.out.print(matriz[j][i]+ " ");
                } else {
                    System.out.print(" "+matriz[j][i]+" ");
                }
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                //int res = matriz[i][j].Math.signum(0);
                
                if (matriz[i][j] == matriz[j][i]) {
                       System.out.println(matriz[i][j] +" matri i j = matriz j i "+matriz[j][i]);
                }
            }
        }
        
        
    }
}
