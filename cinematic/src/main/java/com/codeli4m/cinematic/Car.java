/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.cinematic;

/**
 *
 * @author HP
 */
public class Car {
    private String color;
    // meters and seconds
    private double initialPosition;
    private double finalPosition;
    private double velocity;
    private double currentPosition;
    private double currentTime;
    
    public void startUniformMotion() throws Exception{
        for (int j=1; j<=8;j++){
            for (int i=1;i<=60;i++){
    //            Thread.sleep(1000);
                Thread.sleep(16);            
            System.out.println(i+" - FRAME HERE!");
            }
            System.out.println(j+" - SECOND HAVE PASSED...");
        }
        
    }

    public double getCurrentPosition() {
        return currentPosition;
    }

    public double getCurrentTime() {
        return currentTime;
    }
    
    public Car(){
        
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getInitialPosition() {
        return initialPosition;
    }

    public void setInitialPosition(double initialPosition) {
        this.initialPosition = initialPosition;
    }

    public double getFinalPosition() {
        return finalPosition;
    }

    public void setFinalPosition(double finalPosition) {
        this.finalPosition = finalPosition;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }
    
}
