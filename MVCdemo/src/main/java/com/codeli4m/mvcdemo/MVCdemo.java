/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.mvcdemo;

import controller.Controller;
import model.Model;
import view.CustomView;

/**
 *
 * @author HP
 */
public class MVCdemo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Model cModel = new Model("","",0.0f,0.0f,0.0f);
        CustomView cView = new CustomView();
        Controller cController = new Controller(cView, cModel);
        cController.initView();
        cView.setVisible(true);
        
        
    }
}
