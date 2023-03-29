/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_worker;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
/**
 *
 * @author phong
 */
public class Worker extends Person implements Comparable<Worker>{
    //variables: id, salary, working's year
    public static int count = 1;
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
        count+=1;
    }
    //get, set

    public String getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
    //methods
    //input(or add) method
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        this.id = sc.nextLine();
        super.input();
        System.out.print("Input salary: ");
        this.salary = sc.nextInt();
        System.out.print("Input working's year: ");
        String enter = sc.nextLine();
        this.workYear = sc.nextInt();
        //working's year bonus: 10 year(or more) +10000; 5 year(<10 year) +5000; >5 year +2000.
        if(this.workYear >= 10) {
            this.salary += 10000;
        }
        else if(this.workYear >= 5) {
            this.salary += 5000;
        } else this.salary += 2000;
        count+=1;
    }
    //to string method
    @Override
    public String toString() {
        return String.format("%-5s|", this.id) + super.toString() + String.format("|%-5d|%-2d", this.salary, this.workYear);
    }
    //output method
    @Override
    public void output() {
        System.out.println(toString());
    }
    //sort(with salary)
    @Override
    public int compareTo(Worker obj) {
        if(this.salary > obj.salary) {
            return 1;
        } else if(this.salary == obj.salary) {
            return 0;
        } else return -1;
    }
    //find max
    public void outputHighestSalary(int max) {
        
    }
    
    
    //find min, max
//    public int returnIndexMax(Worker obj[]) {
//        int index = 0;
//        int max = this.salary;
//        for(int i=1; i<obj.length; i++) {
//            if(max < obj[i].salary) {
//                max = obj[i].salary;
//                index = i;
//            }
//        }
//        return index;
//    }
    //file's interaction
//    public void saveToFile() {
//        try {
//            FileWriter myFile = new FileWriter("Workers.doc");
//            myFile.write(toString());
//            myFile.close();
//            System.out.println("Save data successful!!");
//        } catch (Exception e) {
//            System.out.println("Some error happened! " + e.getLocalizedMessage());
//        }
//    }
//    public void accessDataFromFile() {
//        try {
//            FileReader myFile = new FileReader("Workers.doc");
//            BufferedReader br = new BufferedReader(myFile);
//            String data = br.readLine();
//            while(data != null) {
//                
//            }
//            while(data != null) {
//                
//            }
//        } catch (Exception e) {
//            System.out.println("Some error happened! " + e.getLocalizedMessage());
//        }
//    }
}
