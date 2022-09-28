/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.anzil;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Anzil4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // use uppercase on Scanner
        System.out.println("Enter a list of nonnegatives scores");
        System.out.println("Mark the end with a negative score");
        System.out.println("I will compute their average");
        System.out.println("");
        double next;
        // set an start value for sum
        double sum = 0;
        int count = 0;
        next = input.nextDouble();
        while (next>=0){
            sum = sum + next;
            count++;
            // use double plus signs ++
            next = input.nextDouble();
            // input instead of keyboard
        }
        if(count==0){
            System.out.println("No scores entered!");
        }else{
            double average = sum / count;
            System.out.println(count+" scores read.");
            // use uppercase for System.out.println
            System.out.println("The average is: "+average);
            
        }
    }
}
