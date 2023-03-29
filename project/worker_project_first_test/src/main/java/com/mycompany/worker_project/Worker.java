/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.worker_project;
//improt Scanner class
import java.util.Scanner;
/**
 *
 * @author phong
 */
public class Worker extends Person implements Comparable<Worker>{
    //fields
    private String id;
    private int salary;
    private int workYear;
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

    public String getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getWorkYear() {
        return workYear;
    }
    
    //methods
    @Override
    //input method
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input worker id: ");
        this.id = sc.nextLine();
        super.input();
        System.out.print("Input worker salary: ");
        this.salary = sc.nextInt();
        System.out.print("Input worker working's years: ");
        this.workYear = sc.nextInt();
    }
    //output method
    @Override
    public String toString() {
        return String.format("%-10s | ", this.id) + super.toString() + String.format(" | %-10d | %-5d", this.salary, this.workYear);
    }
    @Override
    public void output() {
        System.out.println(toString());
    }
    //sort tăng dần theo lương nhân viên
    @Override
    public int compareTo(Worker obj) {
        if(this.salary > obj.salary) {
            return 1;
        }
        else if(this.salary == obj.salary) {
            return 0;
        } else {
            return -1;
        }
    }
}
