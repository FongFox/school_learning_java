/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.worker_project;
import java.util.Scanner;
/**
 *
 * @author phong
 */
public class Person {
    //fields
    protected String name;
    protected String gender;
    protected int yearBirth;
    //contructors
    public Person() {
        
    }
    public Person(String name, String gender, int yearBirth) {
        this.name = name;
        this.gender = gender;
        this.yearBirth = yearBirth;
    }
    //get, set
    //methos
    //input method
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        this.name = sc.nextLine();
        System.out.print("Input gender: ");
        this.gender = sc.nextLine();
        System.out.print("Input year birth: ");
        this.yearBirth = sc.nextInt();
    }
    //output method
    @Override
    public String toString() {
        return String.format("%-20s | %-3s | %-4d",this.name, this.gender, this.yearBirth);
    }
    public void output() {
        System.out.println(toString());
    }
    
    
}
