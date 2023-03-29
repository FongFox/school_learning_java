/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.product;

/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.input();
        p1.output();
        System.out.println("Total price: " + p1.getPrice(2));
        
        Product p2 = new Product("001", "Milo", "whirlwind", 25, 2023);
        p2.output();
        System.out.println("Total price: " + p2.getPrice(7)); 
        
        Product p3 = new Product();
        p3.input();
        p3.output();
        System.out.println("Total price: " + p3.getPrice(5));
    
    
    }
}
