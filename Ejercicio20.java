
package ejerciciosjava;
import java.util.Scanner;

public class Ejercicio20 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        int num, cont=0;
        
        System.out.println("Ingrese los valores de la matriz");
        System.out.println("Debe ser un numero entre 1 y 9");
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    cont = 0;
                    num = leer.nextInt();
                    if (num<=9 && num>=1) {
                        matriz[i][j] = num;
                    }else{
                        System.out.println("El numero ingresado no es valido");
                        System.out.println("Vuelva a intentarlo");
                        cont = cont +1;
                    }
                } while (cont != 0);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        columna(matriz);
    }
    //COLUMNAS
    public static void columna(int[][] matriz){
        
        int cero=0, uno=0, dos=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (i == 0) {
                    cero = matriz[0][j] + cero;
                }else if (i == 1) {
                    uno = matriz[1][j] + uno;
                }else if (i == 2){
                    dos = matriz[2][j] + dos;
                }
                
            }
        }
        if (cero == uno && cero == dos) {
            System.out.println("La suma de los valores de las columnas es identica ("+ cero+")");
            filas(matriz);
        }else{
            System.out.println("La suma de las columnas no da el mismo resultado");
            System.out.println("por lo que la matriz ingresada NO es magica");
        }
    }
    public static void filas(int[][] matriz){
        
        int cero=0, uno=0, dos=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (j == 0) {
                    cero = matriz[i][0] + cero;
                }else if (j == 1) {
                    uno = matriz[i][1] + uno;
                }else if (j == 2){
                    dos = matriz[i][2] + dos;
                }
            }
        }
        if (cero == uno && cero == dos) {
            System.out.println("La suma de los valores de cada fila ("+cero+") es identica a la de las columnas ("+cero+")");
            diagonales(matriz);
        }else{
            System.out.println("La suma de las filas no da el mismo resultado");
            System.out.println("por lo que la matriz ingresada NO es magica");
        }
    }
    public static void diagonales(int[][] matriz){
        
        int cero=0, uno=0, dos=0, k=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                if (i == j) {
                    uno = matriz[i][j] + uno;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            k = k + 1;
            for (int j = 0; j < 3; j++) {
                if (j == 3-k) {
                    dos = dos + matriz[i][j];
                }
            }
        }
        if (uno == dos) {
            System.out.println("La suma de los valores de cada diagonal ("+uno+") es identica a la de las columnas y las filas ("+dos+")");
            System.out.println("Por lo que la matriz ingresada ES MAGICA");
        }else{
            System.out.println("La suma de las diagonales no da el mismo resultado");
            System.out.println("por lo que la matriz ingresada NO es magica");
        }
    }
}
