
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio21 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                matrizM[m][n] = (int)(Math.random()*100);
            }
        }
        
        System.out.println("          MATRIZ M");
        
        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                if (matrizM[m][n]<=9) {
                    System.out.print(" "+matrizM[m][n]+" ");
                }else if (matrizM[m][n]>=10 || matrizM[m][n]<=99){
                    System.out.print(matrizM[m][n]+" ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("MATRIZ P");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j] = leer.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizP[i][j]<=9) {
                    System.out.print(" "+matrizP[i][j]+" ");
                }else if (matrizP[i][j]>=10 || matrizP[i][j]<=99){
                    System.out.print(matrizP[i][j]+" ");
                }
            }
            System.out.println("");
        }
        
        int cont = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cont = 0;
                for (int m = 0; m < 10; m++) {
                    for (int n = 0; n < 10; n++) {
                        
                        if (matrizM[m][n] == matrizP[i][j] && cont == 0) {
                            cont = cont+1;
                            System.out.println("Matriz P: "+matrizP[i][j]+" M: "+m+" N: "+n);
                            break;
                            if (matrizM[m][n] == matrizP[i][j]) {
                                System.out.println("Matriz P: "+matrizP[i][j]+" M: "+m+" N: "+n);
                            }
                        } 
                        
                        
                    }
                }
            }
        }
        
        
    }
}
//for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matrizP[i][j] = (int)(Math.random()*100);
//                if (matrizP[i][j]<=9) {
//                    System.out.print(" "+matrizP[i][j]+" ");
//                }else if (matrizP[i][j]>=10 || matrizP[i][j]<=99){
//                    System.out.print(matrizP[i][j]+" ");
//                }
//            }
//            System.out.println("");
//        }




