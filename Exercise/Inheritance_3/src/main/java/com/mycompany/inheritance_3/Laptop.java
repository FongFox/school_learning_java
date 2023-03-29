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
public class Laptop extends Product {
    //fields
    private String cpu, ram, ssd;
    //constructor
    public Laptop() {
        super();
    }
    public Laptop(String code, String name, int price, String supplier, String cpu, String ram, String ssd) {
        super(code, name, price, supplier);
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
    }
    //get, set
    //methods
    @Override
    public String toString() {
        return this.cpu + "-" + this.ram + "-" + this.ssd + "-" + super.toString();
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Nhap cpu: ");
        this.cpu = sc.nextLine();
        System.out.print("Nhap ram: ");
        this.ram = sc.nextLine();
        System.out.print("Nhap ssd: ");
        this.ssd = sc.nextLine();
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("CPU: " + this.cpu);
        System.out.println("Ram: " + this.ram);
        System.out.println("Ssd: " + this.ssd);
    }
}
