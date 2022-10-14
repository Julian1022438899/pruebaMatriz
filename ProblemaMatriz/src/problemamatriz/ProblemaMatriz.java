package problemamatriz;

import java.util.Scanner;

/**
 *
 * @author jdaor
 */
public class ProblemaMatriz {
    static int[][] matriz1 = null;
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        matriz1 = definirTamano(matriz1);
        
        System.out.println("FILAS: " + matriz1.length);
        System.out.println("COLUMNAS: " + matriz1[0].length);
        
        System.out.println();
        System.out.println(matriz1);
        System.out.println();
        System.out.println(matriz1);
    }
    public static int[][] definirTamano (int[][] x){
        System.out.println("Ingrese el tamaño de la matriz");
        String datosIngresados = sc.next();
        
        String[] datos = datosIngresados.split("&");
        
        int filas = Integer.parseInt(datos[0]);
        int columnas = Integer.parseInt(datos[1]);
        
        x = new int[filas][columnas];
        
        return x;
    }
    public static void ingresarValores(int[][] x){
        System.out.println("Ingrese valores de la matriz");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = Integer.parseInt(sc.next());
            }
        }
    }
    public static void imprimirMatriz (int[][] x){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }
    
}
