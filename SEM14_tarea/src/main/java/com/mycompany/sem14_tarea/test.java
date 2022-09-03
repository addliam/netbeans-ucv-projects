/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem14_tarea;

/**
 *
 * @author HP
 */
public class test {
    public static void main(String[] args) {
        System.out.println("Primer mensaje");
        
        int[] miArreglo= {1,5,7,9,4,5,100};

int[] edad={12,9,13,15,24,21,18};
int[] notas={12,10,13,18,11,16};
int suma=0;

for(int i=0; i<6; i++)

{

if (notas[i]%3==0 && notas[i]%2==0)

suma+=notas[i];

}



        System.out.println("SUMA: "+suma);
//        int i;
//        for (i=50; i<20; i+=6){
//            System.out.println("El valor de i es "+i);
//        }        
//        System.out.println("Ultimo mensaje");
    }
}
