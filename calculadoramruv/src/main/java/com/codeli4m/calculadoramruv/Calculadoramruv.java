/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.calculadoramruv;

/**
 *
 * @author HP
 */
//Un movimiento rectilíneo uniforme (m.r.u.) es aquel que tiene su velocidad constante y su trayectoria es una línea recta. Esto implica que:
//
//El espacio recorrido es igual que el desplazamiento.
//En tiempos iguales se recorren distancias iguales.
//La rapidez o celeridad es siempre constante y coincide con el módulo de la velocidad.
public class Calculadoramruv {

    public static void main(String[] args) {
        System.out.println("TESTING MRU!");
        float v = getVelocityWithPositionAndTime(0, 12, 4, 25);
        System.out.println("VELOCIDAD ES: "+v);
        float fPosition = getFinalPositionWithVelocityAndTime(0, 4, 8, v);
        System.out.println("POSICION FINAL: "+fPosition);
        
    }
    
    public static float getVelocityWithPositionAndTime (float initialPosition, float finalPosition, float initialTime, float finalTime){
        float positionDiference = finalPosition - initialPosition;
        float timeDiference = finalTime - initialTime;
        float velocity = positionDiference/timeDiference;
        return velocity;
    }
    public static float getFinalPositionWithVelocityAndTime (float initialPosition, float initialTime, float finalTime, float velocity){
        float timeDiference = finalTime - initialTime;
        float finalPosition = initialPosition + (velocity * timeDiference);
        return finalPosition;
    }
    
    
}
