/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_worker;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        WorkerList list = new WorkerList();
        list.add();
        list.output();
        //setting
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        ArrayList<Worker> workers = new ArrayList<Worker>();
        workers.
        //run
        while(quit!=true) {
            int option = returnOption();
            switch (option) {
                case 0:
                    System.out.println("Have a great day!!"); quit=true;
                    break;
                case 1:
                    System.out.println("Input worker's numbers: ");
                    int n = sc.nextInt();
                    for(int i=1; i<=n; i++) {
                        Worker data = new Worker();
                        data.input();
                        workers.add(data);
                    }
                    break;
                case 2:
                    for (Worker worker : workers) {
                        System.out.println(worker);
                    }
                    break;
                case 3:
                    try {
                        FileWriter myFile = new FileWriter("Workers.doc");
                        for (Worker worker : workers) {
                            myFile.write(worker.toString());
                        }
                        myFile.close();
                        System.out.println("Save data successful!!");
                    } catch (Exception e) {
                    System.out.println("Some error happened! " + e.getLocalizedMessage());
                    }
                    break;
                case 4:
                    
                    break;
                case 5:
                    Collections.sort(workers);
                    System.out.println("Sort ascending complete!!");
                    break;
                case 6:
                    Collections.sort(workers, Collections.reverseOrder());
                    System.out.println("Sort descending complete!!");
                    break;
                case 7:
//                    int maxIndex = 0;
//                    int max = workers.get(0).getSalary();
//                    for(int i=1; i<workers.size(); i++) {
//                        Worker nextWorker = workers.get(i);
//                        if(max < nextWorker.getSalary()) {
//                            max = nextWorker.getSalary();
//                            maxIndex = i;
//                        }
//                    }
//                    System.out.println("Worker have the highest salary:\n" + workers.get(maxIndex).toString());
                    
                    
                    break;
                case 8:
//                    int minIndex = 0;
//                    int min = workers.get(0).getSalary();
//                    for(int i=1; i<workers.size(); i++) {
//                        Worker nextWorker = workers.get(i);
//                        if(min > nextWorker.getSalary()) {
//                            min = nextWorker.getSalary();
//                            minIndex = i;
//                        }
//                    }
//                    System.out.println("Worker have the highest salary:\n" + workers.get(minIndex).toString());
                    break;
                case 9:
//                    System.out.print("Input worker's id want to find: ");
//                    String id = sc.nextLine();
//                    for (Worker worker : workers) {
//                        if(worker.getId().equals(id)) {
//                            System.out.println("This worker has been found!!");
//                            System.out.println(worker);
//                            break;
//                        }
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    public static int returnOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add worker"); //done
        System.out.println("2.Output worker"); //done
        System.out.println("3.Save to file(.doc)"); //done
        System.out.println("4.Read data from file(.doc)");
        System.out.println("5.Sort ascending(with salary)"); //done
        System.out.println("6.Sort descending(with salary)"); //done
        System.out.println("7.Find worker have the highest salary");
        System.out.println("8.Find worker have the lowest salary");
        System.out.println("9.Search and output 1 worker's information.");
        System.out.println("0.Exit"); //done
        System.out.println("Your choice: ");
        int option = sc.nextInt();
        return option;
    }
}
