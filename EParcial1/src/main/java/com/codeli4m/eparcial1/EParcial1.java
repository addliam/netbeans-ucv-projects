/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.eparcial1;

/**
 *
 * @author HP
 */
public class EParcial1 {

    public static void main(String[] args) {
        System.out.println("Starting application!");
        Interface gui = new Interface();
        gui.setTitle("Registro de notas de estudiantes");
        gui.setLocationRelativeTo(null);
        gui.setVisible(true);        
    }
}
