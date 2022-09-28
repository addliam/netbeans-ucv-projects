package com.codeli4m.anzil;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Anzil {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String limitString = scan.nextLine();
        int limit = Integer.parseInt(limitString);
        // TODO: try except for convertion to int
        int i=1;
        System.out.println("Printing even numbers");
        do{
            if (i%2==0){
                System.out.println(i);
            }
            i++;
        }while (i<=limit);        
        
        System.out.println("Printing odd numbers");
        int k=1;
        while(k<=limit){
            if (k%2!=0){
                System.out.println(k);
            }
            k++;
        }
        
        System.out.println("Printing COUNTDOWN!");
        for (int j=limit;j>=0;j--){
            System.out.println(j);
        }
    }
}
