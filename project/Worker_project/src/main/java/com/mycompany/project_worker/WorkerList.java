/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_worker;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Collections;
import java.io.IOException;
/**
 *
 * @author phong
 */
public class WorkerList{
    //variables: list
    private ArrayList<Worker> list;
    //constructors
    public WorkerList() {
        list = new ArrayList<Worker>();
    }
    public WorkerList(ArrayList<Worker> list) {
        this.list = list;
    }
    //file's interaction
    //save data to file method
    public void saveToFile(String fileName, boolean append) {
        try {
            FileWriter myFile;
            myFile = new FileWriter(fileName, append);
            for (Worker item : list) {
                myFile.write(item.toString());
            }
            myFile.close();
            System.out.println("Save file complete!!");
        } catch (Exception e) {
            System.out.println("Something error happended!!\n" + e.getLocalizedMessage());
        }
    }
    //read data from file method
    public void readFromFile() {
        try {
            FileReader myFile = new FileReader("Workers.txt");
            BufferedReader br = new BufferedReader(myFile);
            String s = br.readLine();
            while (s != null) {                
                String arr[] = s.split("\\|"); 
//                for (String item : arr) {
//                    System.out.println(item);
//                }
                String id = arr[0].trim(); 
                String name = arr[1].trim(); 
                String gender = arr[2].trim(); 
                int yearBirth = Integer.parseInt(arr[3].trim()); 
                int salary = Integer.parseInt(arr[4].trim()); 
                int workYear = Integer.parseInt(arr[5].trim()); 
                Worker item = new Worker(id, name, gender, yearBirth, salary, workYear);
                list.add(item);
                s = br.readLine();
            }
            myFile.close(); br.close();
            System.out.println("Read file complete!!");
        } catch (Exception e) {
            System.out.println("Something error happended!!\n" + e.getLocalizedMessage());
        }
    }
    //methods
    //add method
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input worker number: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            System.out.println("==============================");
            System.out.println("Input worker " + i);
            Worker item = new Worker(); item.add();
            list.add(item);
        }
        saveToFile("Workers.txt", true);
    }
    //delete method
    void delete() {
        int flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input worker id you want to delete: ");
        String id = sc.nextLine();
        for (Worker worker : list) {
            if(worker.getId().equals(id)) {
                list.remove(worker); flag = 1;
                System.out.println("Delete worker (by id " + id + ") complete!!");
                break;
            }
        }
        if(flag==0) {
            System.out.println("No worker's id " + id + " had been found!!");
        }
        saveToFile("Workers.txt", false);
    }
    //output method
    void output() {
        for (Worker worker : list) {
            worker.output();
        }
    }
    //sort method (1: ascending || 0: descending)
    public void outputCompareAscending(int mode) {
        if(mode == 1) 
            Collections.sort(list);
        else 
            Collections.sort(list, Collections.reverseOrder());
        System.out.println("Ascending sort complete!!");
    }
    //return max
    public Worker returnMaxSalary() {
        Worker max = list.get(0);
        for (Worker worker : list) {
            if(max.getSalary() < worker.getSalary()) {
                max = worker;
            }
        }
        return max;
    }
    //return min
    public Worker returnMinSalary() {
        Worker min = list.get(0);
        for (Worker worker : list) {
            if(min.getSalary() > worker.getSalary()) {
                min = worker;
            }
        }
        return min;
    }
    //search worker's information
    public void findWorkerInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input worker's id want to search: ");
        String id = sc.nextLine();
        for (Worker worker : list) {
            if(worker.getId().equals(id)) {
                System.out.println("Worker have been found!");
                System.out.println(worker);
                return;
            }
        }
        System.out.println("No worker have been found(by id)!!");
    }
    //search and change worker's information
    public void findAndChangeWorkerInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("input worker's id want to search: ");
        String id = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if( list.get(i).getId().equals(id) ) {
                Worker item = new Worker();
                System.out.println("Worker have been found!");
                item.add();
                
                System.out.println(item);
                
                list.set(i, item);
                
                System.out.println(list.get(i));
                
                System.out.println("Change worker's information complete!!");
                saveToFile("Workers.txt", false);
                return;
            }
        }
        System.out.println("No worker have been found(by id)!!");
    }
    //output min, max salary(1: max || 0: min)
    public void outputMinOrMaxSalary(int mode) {
        Worker min, max;
        if(mode == 1)  {
            max = returnMaxSalary();
            System.out.println("Worker have the highest salary!\n" + max);
        }
        else {
            min = returnMinSalary();
            System.out.println("Worker have the lowest salary!\n" + min);
        }
    }
}
