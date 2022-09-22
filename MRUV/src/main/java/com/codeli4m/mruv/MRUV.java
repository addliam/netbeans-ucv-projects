/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.mruv;

/**
 *
 * @author HP
 */
public class MRUV {
    
    // distancia, tiempo, velocidadInicial, velocidadFinal, aceleracion;
    
    // CALCULO DE VARIABLES
    private double calcularDistanciaConVelocidadInicial(double velocidadInicial, double tiempo, double aceleracion){
        double cDistancia = velocidadInicial*tiempo+0.5*aceleracion*tiempo*tiempo;
        return cDistancia;
    }

    private double calcularDistanciaConVelocidadFinal(double velocidadFinal, double tiempo, double aceleracion){
        double cDistancia = velocidadFinal*tiempo-0.5*aceleracion*tiempo*tiempo;
        return cDistancia;
    }
    
    // FORMULAS
    public double[] getDistanciaYVelocidadInicial(double velocidadFinal, double tiempo, double aceleracion){
        double[] resultado = new double[2];
        double distancia = calcularDistanciaConVelocidadFinal(velocidadFinal, tiempo, aceleracion);
        double velocidadInicial = velocidadFinal - aceleracion * tiempo;
        resultado[0] = distancia;
        resultado[1] = velocidadInicial;
        return resultado;
    }    
    
    public double[] getDistanciaYVelocidadFinal(double velocidadInicial, double tiempo, double aceleracion){
        double[] resultado = new double[2];
        double distancia = calcularDistanciaConVelocidadInicial(velocidadInicial, tiempo, aceleracion);
        double velocidadFinal = velocidadInicial + aceleracion * tiempo;
        resultado[0] = distancia;
        resultado[1] = velocidadFinal;
        return resultado;
    }

    public double[] getDistanciaYTiempo(double velocidadInicial, double velocidadFinal, double aceleracion){
        double[] resultado = new double[2];
        double tiempo = (velocidadFinal-velocidadInicial)/aceleracion;
        double distancia = calcularDistanciaConVelocidadInicial(velocidadInicial, tiempo, aceleracion);
        resultado[0] = distancia;
        resultado[1] = tiempo;
        return resultado;
    }
    public double[] getDistanciaYAceleracion(double velocidadInicial, double velocidadFinal, double tiempo){
        double[] resultado = new double[2];
        double aceleracion = (velocidadFinal-velocidadInicial)/tiempo;
        double distancia = calcularDistanciaConVelocidadInicial(velocidadInicial, tiempo, aceleracion);
        resultado[0] = distancia;
        resultado[1] = tiempo;
        return resultado;
    }
    // PARA VELOCIDAD INICIAL
    public double[] getVelocidadInicialYVelocidadFinal(double distancia, double tiempo, double aceleracion){
        double[] resultado = new double[2];
        double velocidadInicial = (distancia-(aceleracion*tiempo*tiempo/2))/tiempo;
        double velocidadFinal = tiempo*aceleracion+velocidadInicial;      
        resultado[0] = velocidadInicial;
        resultado[1] = velocidadFinal;
        return resultado;
    }
    public double[] getVelocidadInicialYTiempo(double distancia, double velocidadFinal, double aceleracion){
        double[] resultado = new double[2];
        double prevCalculo = (velocidadFinal*velocidadFinal)-(2*aceleracion*distancia);
        // antes de sacar raiz cuadrada asegurarse que sea positivo
        prevCalculo = (prevCalculo<0) ? (prevCalculo*-1) : prevCalculo; 
        double velocidadInicial = Math.sqrt(prevCalculo);
        double tiempo = (velocidadFinal - velocidadInicial)/aceleracion;
        resultado[0] = velocidadInicial;
        resultado[1] = tiempo;
        return resultado;
    }
    public double[] getVelocidadInicialYAceleracion(double distancia, double velocidadFinal, double tiempo){
        double[] resultado = new double[2];
        double velocidadInicial = (2*distancia/tiempo)-velocidadFinal;
        double aceleracion = (velocidadFinal-velocidadInicial)/tiempo;
        resultado[0] = velocidadInicial;
        resultado[1] = aceleracion;
        return resultado;
    }
    // VELOCIDAD FINAL
    public double[] getVelocidadFinalYTiempo(double distancia, double velocidadInicial, double aceleracion){
        double[] resultado = new double[2];
        double prevCalculo = (velocidadInicial*velocidadInicial) + (2*distancia*aceleracion);
        System.out.println(prevCalculo);
        double velocidadFinal = Math.sqrt(prevCalculo);
        double tiempo = (velocidadFinal - velocidadInicial)/aceleracion;
        resultado[0] = velocidadFinal;
        resultado[1] = tiempo;
        return resultado;
    }
    public double[] getVelocidadFinalYAceleracion(double distancia, double velocidadInicial, double tiempo){
        double[] resultado = new double[2];
        double velocidadFinal = (2*distancia/tiempo)-velocidadInicial;
        double aceleracion = (2*(distancia-(velocidadInicial*tiempo)))/(tiempo*tiempo);
        resultado[0] = velocidadFinal;
        resultado[1] = aceleracion;
        return resultado;
    }
    // ACELERACION
    public double[] getTiempoYAceleracion(double distancia, double velocidadInicial, double velocidadFinal){
        double[] resultado = new double[2];
        double tiempo = distancia * (2/(velocidadInicial+velocidadFinal));
        double aceleracion = ((velocidadFinal*velocidadFinal)-(velocidadInicial*velocidadInicial))/(2*distancia);
        resultado[0] = tiempo;
        resultado[1] = aceleracion;
        return resultado;
    
    }
        

    public static void main(String[] args) {
        double[] res;
        System.out.println("Hello World!");
        MRUV mruvObject = new MRUV();
        mruvObject.printBanner();
        res = mruvObject.getDistanciaYTiempo(0, 60, 20);
        System.out.println("DISTANCIA: "+res[0]);
        System.out.println("TIEMPO: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getDistanciaYVelocidadFinal(0, 15, 20);
        System.out.println("DISTANCIA: "+res[0]);
        System.out.println("VELOCIDAD FINAL: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getDistanciaYVelocidadInicial(60, 3, 10);
        System.out.println("DISTANCIA: "+res[0]);
        System.out.println("VELOCIDAD INICIAL: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getDistanciaYAceleracion(0,120,12);
        System.out.println("DISTANCIA: "+res[0]);
        System.out.println("ACELERACION: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getVelocidadInicialYVelocidadFinal(120, 2, 20);
        System.out.println("VELOCIDAD INICIAL: "+res[0]);
        System.out.println("VELOCIDAD FINAL: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getVelocidadInicialYTiempo(120, 80, 20);
        System.out.println("VELOCIDAD INICIAL: "+res[0]);
        System.out.println("TIEMPO: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getVelocidadInicialYAceleracion(120,80,2);
        System.out.println("VELOCIDAD INICIAL: "+res[0]);
        System.out.println("ACELERACION: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getVelocidadFinalYTiempo(200,10,20);
        System.out.println("VELOCIDAD FINAL: "+res[0]);
        System.out.println("TIEMPO: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getVelocidadFinalYAceleracion(200, 10, 10);
        System.out.println("VELOCIDAD FINAL: "+res[0]);
        System.out.println("ACELERACION: "+res[1]);
        System.out.println("--------------------------");
        res = mruvObject.getTiempoYAceleracion(160, 10, 30);
        System.out.println("TIEMPO: "+res[0]);
        System.out.println("ACELERACION: "+res[1]);
        System.out.println("--------------------------");
        
    }
    
    public void printBanner(){
        System.out.println("BIENVENIDOS A LA CALCULADORA DE MRUV");
    }

}
