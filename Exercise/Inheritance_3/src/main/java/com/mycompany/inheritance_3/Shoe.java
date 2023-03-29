/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_3;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Shoe extends Product {
    //fields
    private int size;
    private String color;
    //constructor
    public Shoe () {
        super();
    }
    public Shoe (String code, String name, int price, String supplier ,int size, String color) {
       super(code, name, price, supplier);
       this.size = size;
       this.color = color;
    }
    //get, set
    
    //methods
    @Override
    public String toString() {
        return super.toString() + "-" + this.size + "-" + this.color;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap size: ");
        this.size = sc.nextInt();
        System.out.print("Nhap mau: ");
        this.color = sc.nextLine();
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Size: " + this.size);
        System.out.println("Color: " + this.color);
    }
    
}
