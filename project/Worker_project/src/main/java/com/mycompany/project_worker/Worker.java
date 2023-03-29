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
public class Worker extends Person implements Comparable<Worker>{
    //variables: id, salary, working's year
    private String id;
    private int salary, workYear;
    //constructors
    public Worker() {
        super();
    }
    public Worker(String id, String name, String gender, int yearBirth, int salary, int workYear) {
        super(name, gender, yearBirth);
        this.id = id;
        this.salary = salary;
        this.workYear = workYear;
    }
    //get, set

    public int getSalary() {
        return salary;
    }

    public String getId() {
        return id;
    }
    
    //methods
    @Override
    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        this.id = sc.nextLine();
        super.add();
        System.out.print("Input salary: ");
        this.salary = sc.nextInt();
        System.out.print("Input working's year: ");
        String enter = sc.nextLine();
        this.workYear = sc.nextInt();
    }
    //to string method
    @Override
    public String toString() {
        return String.format("%-15s|", this.id) + super.toString() + String.format("|%-10d|%-5d\n", this.salary, this.workYear);
    }
    //output method
    @Override
    public void output() {
        System.out.print(toString());
    }
    //return compare method
    @Override
    public int compareTo(Worker obj) {
        if(this.salary > obj.salary) {
            return 1;
        } else if(this.salary == obj.salary) {
            return 0;
        } else return -1;
    }
}
