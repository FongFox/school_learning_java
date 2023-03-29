/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_worker;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Person {
    //variables: name, gender, year birth.
    protected String name, gender;
    protected int yearBirth;
    //Constructors
    public Person() {
        
    }
    public Person(String name, String gender, int yearBirth) {
        this.name = name;
        this.gender = gender;
        this.yearBirth = yearBirth;
    }
    //get, set
    //methods
    //input (or add) method
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input worker name: ");
        this.name = sc.nextLine();
        System.out.print("Input worker gender: ");
        this.gender = sc.nextLine();
        System.out.print("Input worker year birth: ");
        this.yearBirth = sc.nextInt();
    }
    //to string method
    @Override
    public String toString() {
        return String.format("%-5s|%-3s|%-4d", this.name, this.gender, this.yearBirth);
    }
    //output method
    public void output() {
        System.out.println(toString());
    }
}
