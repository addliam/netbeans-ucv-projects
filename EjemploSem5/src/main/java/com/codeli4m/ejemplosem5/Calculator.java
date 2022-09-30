/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.ejemplosem5;

/**
 *
 * @author HP
 */
public class Calculator {
    private double value1 = 0;
    private double value2 = 0;

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public double add(){
        return (this.value1+this.value2);
    }
    public double substract(){
        return (this.value1-this.value2);
    }    
    public double divide(){
        return (this.value1/this.value2);
    }    
    public double multiply(){
        return (this.value1*this.value2);
    }    
    public double modulus(){
        return (this.value1%this.value2);
    }
    public double square(){
        return (Math.sqrt(this.value1));
    }
    public double pow(){
        double res=1;
        for (int i=0;i<this.value2;i++){
            res = this.value1 * res;
        }
        return (res);
    }        
}
