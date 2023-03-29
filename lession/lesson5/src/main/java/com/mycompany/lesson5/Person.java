/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson5;

//2) Xây dựng lớp Người (Person.java) bao gồm:
//- Fields: id, name, birthYear, address
//- Constructor 0 tham số và 4 tham số
//- Hàm input(): nhập id, name, birthYear , address
//- Hàm tính tuổi (getAge): return tuổi, tuổi = năm hiện tại – năm sinh
//- Hàm sayHello(): xuất dòng “I am <name>. I am <age> years old. Hello everybody!!!”
//Lớp Main (Main.java) chứa hàm main()
//- Tạo 2 đối tượng Person: person1 dùng constructor 0 tham số và person2 dùng constructor 
//4 tham số
//- Xuất câu chào

/**
 *
 * @author phong
 */
import java.util.Scanner;

public class Person {
    //fields
    private int id; 
    private String name;
    private int birthYear;
    private String address;
    //constructor
    public Person() {
    
    }
    public Person(int id, String name, int birthYear, String address) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }
    //set,get
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int birthYear() {
        return birthYear;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    //methods (or function)
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your id: ");
        this.id = sc.nextInt();
        String clone = sc.nextLine();
        System.out.print("Input your name: ");
        this.name = sc.nextLine();
        System.out.print("Input your birth year: ");
        this.birthYear = sc.nextInt();
        String clone2 = sc.nextLine();
        System.out.println("Input your address: ");
        this.address = sc.nextLine();
    }
    
    public int getAge () {
        int age; int currentYear = 2022;
        return age = currentYear - this.birthYear;
    }
    
    public void sayHello() {
        System.out.println("I am " + this.name + ". I am " + getAge() + " years old. Hello everybody!!!");
    }
}
