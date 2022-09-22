/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.sem4ciclo2;

/**
 *
 * @author HP
 */
public class Student {
    private String fullNameString;
    private float score1;
    private float score2;
    private float score3;
    
    private float credit1;
    private float credit2;
    private float credit3;

    public String getFullNameString() {
        return fullNameString;
    }

    public float getScore1() {
        return score1;
    }

    public float getScore2() {
        return score2;
    }

    public float getScore3() {
        return score3;
    }

    public float getCredit1() {
        return credit1;
    }

    public float getCredit2() {
        return credit2;
    }

    public float getCredit3() {
        return credit3;
    }

    public Student(String fullNameString, float score1, float score2, float score3, float credit1, float credit2, float credit3) {
        this.fullNameString = fullNameString;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.credit1 = credit1;
        this.credit2 = credit2;
        this.credit3 = credit3;
    }
    public float getSimpleAverage(){
        float simpleAverage = (this.score1+this.score2+this.score3)/3;
        return simpleAverage;
    }
    public float getPonderedAverage(){
        float ponderedAverage = ((this.score1*this.credit1)+(this.score2*this.credit2)+(this.score3*this.credit3))/(this.credit1+this.credit2+this.credit3);
        return ponderedAverage;
    }
    
}
