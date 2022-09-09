/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.poo1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */

public class Poo1 {
    public static List<Object> customersList = new ArrayList<>();


    public List<Object> getListOfCustomers(){
        return customersList;
    }
    private static void printListOfCustomers(){
        for (int i=0; i < customersList.size(); i++){
            Object obj = customersList.get(i);
            Customer customerObj = (Customer) obj;
            customerObj.printCustomerInfo();
        }
        
    }
    
    public static void main(String[] args) {
//        Automovil auto_1 = new Automovil("GT-45U1J253", "TOYOTA", "BLACK", 180.6f, "25-10-2016");
//        auto_1.Acelerar(160.24f);
//        auto_1.GetInfo();
//        System.out.println("");
//        auto_1.ChangeColor("WHITE");
//        System.out.println("");
//        auto_1.GetInfo();
        Customer test_client;
        Customer test_client1;
        Customer test_client2;
        
        try {
            test_client = new Customer("78914527", "Jose", "Vela", "Carrasco", 19, "josevela2000@gmail.com");
            test_client1 = new Customer("72814647", "Fabricio", "Mitra", "Vivek", 32, "fabrMitra32@gmail.com");
            test_client2 = new Customer("78914527", "Jose", "Vela", "Carrasco", 19, "josevela@gmail.com");

//            test_client.printCustomerInfo();
            test_client.setEmail("jvelacarrasco@gmail.com");
//            test_client.printCustomerInfo();
            customersList.add(test_client);
            customersList.add(test_client1);
            customersList.add(test_client2);
            
            printListOfCustomers();

        } catch (Exception e) {
            System.out.println(e);
            // TODO: show message error dialog
        }
    }
}
