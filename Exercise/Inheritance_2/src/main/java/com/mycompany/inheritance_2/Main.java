/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inheritance_2;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.print("Input number circle: ");
        n = sc.nextInt();
        Circle c[] = new Circle[n];
        for(int i = 0; i < n; i++) {
            c[i] = new Circle();
            c[i].input();
        }
        for(int i = 0; i < n    ; i++) {
            c[i].draw();
            System.out.println("perimeter: " + c[i].perimeter() + ", area: " + c[i].area());
        }
        
        
    }
    
}
