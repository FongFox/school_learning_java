/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson3;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Rectangle {
    private int width;
    private int length;
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getLenght() {
        return length;
    }
        
    public int rectangularAcreage() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input length: ");
//        length = sc.nextInt();
//        System.out.print("Input width: ");
//        width = sc.nextInt();
        return (length * width);
    }
    
    public int rectangularPerimeter() {
        return (length + width) * 2;
    }
    
    public void inputRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input length: ");
        this.length = sc.nextInt();
        System.out.print("Input width: ");
        this.width = sc.nextInt();
        
    }
}
