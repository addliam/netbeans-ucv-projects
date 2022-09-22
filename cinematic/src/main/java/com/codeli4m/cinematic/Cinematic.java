/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.cinematic;

/**
 *
 * @author HP
 */
public class Cinematic {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car car = new Car();
        try {
            car.startUniformMotion();
        } catch (Exception e) {
            System.out.println("ERROR STARTING UNIFORM MOTION");
        }
    }
}
