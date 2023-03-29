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
public class Product {
    //fields
    protected String code;
    protected String name;
    protected int price;
    protected String supplier;
    //constructor
    public Product() {
        
    }
    public Product(String code, String name, int price, String supplier) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
    }
    //get, set
    //methods
    @Override
    public String toString() {
        return this.code + "-" + this.name + "-" + this.price + "-" + this.supplier;
    }
    void input() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nhap ma san pham: ");
        this.code = sc.nextLine();
        System.out.print("Nhap ten san pham: ");
        this.name = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        this.price = sc.nextInt();
        System.out.print("Nhap nha cung cap: ");
        this.supplier = sc.nextLine();
    }
    void output() {
        System.out.println("Ma san pham: " + this.code);
        System.out.println("Ten san pham: " + this.name);
        System.out.println("Gia san pham: " + this.price);
        System.out.println("Nha cung cap: " + this.supplier);
//        System.out.println(toString());
    }
}
