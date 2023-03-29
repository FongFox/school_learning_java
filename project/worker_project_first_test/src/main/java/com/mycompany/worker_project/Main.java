/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.worker_project;

import static java.awt.SystemColor.menu;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) throws IOException {
        //general settings
        ArrayList<Worker> workers = new ArrayList<Worker>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        //menu
        while(quit != true) {
            //settings
            int option = returnOption();
            //menu(run)
            switch (option) {
                //quit
                case 0: 
                    System.out.println("Quitting!!"); quit = true;
                    break;
                //input (add) workers
                case 1:
                    System.out.print("Input number workers: ");
                    int n = sc.nextInt();
                    for(int i = 1; i <= n; i++) {
                        Worker worker = new Worker();
                        System.out.println("\t\t Input worker " + i + "\t\t");
                        worker.input();
                        workers.add(worker);
                    }
                    break;
                //output workers
                case 2:
                    for(Person worker : workers) {
                        System.out.println(worker);
                    }
                    break;
                //delete worker from list
                case 3:
                    if(workers.isEmpty()) {
                        System.out.println("Worker list doesn't exist!");
                    }else {
                        System.out.print("Input worker's index you want to delete: ");
                        int i = sc.nextInt();
                        workers.remove(--i);
                        System.out.println("Remove complete!!");
                    }
                    break;
                //save data worker to file(.doc)
                case 4:
                    try {
                        FileWriter myFile = new FileWriter("Workers.doc");
                        for (Person worker : workers) {
                            myFile.write(worker.toString() + "\n");
                        }
                        myFile.close();
                        System.out.println("Save data complete!!");
                    } catch (Exception e) {
                        System.out.println("File cann't be saved!! " + e.getLocalizedMessage());
                    }
                    break;
                //read data from file(.doc)
                case 5:
                try {
                    FileReader myFile = new FileReader("Workers.doc");                       BufferedReader br = new BufferedReader(myFile);
                    String line = br.readLine();
                    while(line != null) {
                        System.out.println(line);
                        line = br.readLine();
                    }
                    myFile.close(); br.close();
                    
                } catch (Exception e) {
                    System.out.println("File cann't be read!! " + e.getLocalizedMessage());
                }                                    
                    break;
                //sort worker ascending(with salary)
                case 6:
                    Collections.sort(workers);
                    break;
                default:
                    throw new AssertionError();
            }
            String enter = sc.nextLine();
            System.out.print("Press Any Key To Continue...");
            String pause = sc.nextLine();
        }
    }
    
    public static int returnOption() {
            //settings
            Scanner sc = new Scanner(System.in);
            //input, output
            System.out.println("1.Input (or add more) workers");
            System.out.println("2.Output workers");
            //add, delete
            System.out.println("3.Delete worker");
            //file's interaction
            System.out.println("4.Create new file and write data");
            System.out.println("5.Read the data in file");
            //Arrange
            System.out.println("6.Sort workers ascending(with salary)");
            System.out.println("7.Sort workers descending(with salary)");
            System.out.println("8.Sort workers ascending(with working's year)");
            System.out.println("9.Sort workers descending(with working's year)");
            //min, max
//            System.out.println("9.Find the worker have the highest salary");
//            System.out.println("9.Find the worker have the smallest salary");
            //quit
            System.out.println("0.Quit");
            //input option
            System.out.print("Input choice: ");
            int option = sc.nextInt();
            //return
            return option;
    }
}
