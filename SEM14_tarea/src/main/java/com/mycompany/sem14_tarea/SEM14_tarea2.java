package com.mycompany.sem14_tarea;

/**
 *  EJERCICIO 
 * @author codeli4m
 */
public class SEM14_tarea2 {
    public static void main(String[] args) {
        int matriz[][];
        matriz= new int [5][5]; 
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){ 
                if (i==0 || i==4|| j==0 ||j==4){
                    matriz[i][j]= 1;
                }else {
                    matriz[i][j]= 0;
                }      
            }
        }
        for (int[] fila : matriz) {
            for (int j = 0; j<matriz.length; j++) {
                System.out.print(" " + fila[j]);          
            }
            System.out.println();
        }
    }
}
