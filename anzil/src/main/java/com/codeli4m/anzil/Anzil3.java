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
public class Anzil3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        String numberStudentsString = scan.nextLine();
        int numberStudents = Integer.parseInt(numberStudentsString);
        // TODO: check if is valid number
        int[] quizMarksArray = new int[numberStudents];
        System.out.println("Enter each quiz mark use number between 0 and 10.");
        for (int i=1;i<=numberStudents;i++){
            boolean isValidInput = false;
            do{
                System.out.print("Student "+i+" -> ");
                String quizMarksString = scan.nextLine();
                try {
                    int quizMark = Integer.parseInt(quizMarksString);
                    if (quizMark>=0 && quizMark <=10){
                        quizMarksArray[i-1] = quizMark;
                        isValidInput = true;
                    }else{
                        System.out.println("Make sure your input is in range 0-10");
                        isValidInput=false;
                    }
                } catch (Exception e) {
                    System.out.println("Make sure your input is a number");
                }
            }while(!isValidInput);
        }
        System.out.println("REGISTER HAS FINISHED!");
        int maxQuizMarkValue = quizMarksArray[0];
        int minQuizMarkValue = quizMarksArray[0];
        int sum = 0;
        for (int quizMarkValue: quizMarksArray){
            if (quizMarkValue >= maxQuizMarkValue){
                maxQuizMarkValue = quizMarkValue;
            }
            if (quizMarkValue <= minQuizMarkValue){
                minQuizMarkValue = quizMarkValue;
            }
            sum += quizMarkValue;
        }
        double averageQuizMark = sum/numberStudents;
        int failedStudentsCounter = 0;
        for (int quizMarkValue: quizMarksArray){
            if (quizMarkValue < averageQuizMark){
                failedStudentsCounter += 1;
            }
        }
        System.out.println("AVERAGE: "+averageQuizMark);
        double firstOpera = (Double.parseDouble(String.valueOf(failedStudentsCounter))/Double.parseDouble(String.valueOf(numberStudents)));
        double percentageFailedStudents = firstOpera*100;
        System.out.println("Minimum score: "+minQuizMarkValue);
        System.out.println("Minimum score: "+maxQuizMarkValue);
        System.out.println("Percentage failed students: "+percentageFailedStudents+"%");
    }
}
