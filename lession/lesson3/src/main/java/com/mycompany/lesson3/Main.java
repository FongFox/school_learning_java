/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson3;

/**
 *
 * @author phong
 */

public class Main {

    public static void main(String[] args) {
        Rectangle hcn = new Rectangle();
        hcn.inputRectangle();
        int S = hcn.rectangularAcreage();
        int P = hcn.rectangularPerimeter();
        System.out.println(S);
        System.out.println(P);
    }
    
    
}
