package com.mycompany.sem14_tarea;

/**
 * EJERCICIO 3: Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
 * @author codeli4m
 */

import java.util.Scanner;
public class SEM14_tarea {
    
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      
      int matriz[][], nFil=3, nCol=3;
      
      matriz=new int[nFil][nCol];
      
      System.out.println("Complete la matriz de 3x3");
      for(int i=0; i<nFil; i++){
      	for(int j=0; j<nCol; j++){
      		System.out.print("Elemento ["+i+"]" + "["+j+"] : ");
      		matriz[i][j]=scan.nextInt();
      	}
      }
      
      System.out.println("\nTu matriz es: ");
      for(int i=0; i<nFil; i++){
      	for(int j=0; j<nCol; j++){
            System.out.print("[" + matriz[i][j] + "]" + " ");
      	}
      	System.out.println();
      }
      
      System.out.println("\nLa matriz invertida es: ");
      for(int i=0; i<nFil; i++){
      	for(int j=0; j<nCol; j++){
            System.out.print("[" + matriz[j][i] + "]" + " ");
      	}
      	System.out.println();
      }
 
      scan.close();
    }
}