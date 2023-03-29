/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project_worker;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        menuRun();
    }
    //====================================================================
    public static int returnOption() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Read file");
        System.out.println("2.Add worker");
        System.out.println("3.Delete Worker(by id)");
        System.out.println("4.Sort Worker ascending(by salary)");
        System.out.println("5.Sort Worker descending(by salary)");
        System.out.println("6.Search and find worker's information");
        System.out.println("7.Search and change worker's information(by id)");
        System.out.println("8.Find worker have the highest salary");
        System.out.println("9.Find worker have the lowest salary");
        System.out.println("0.Quit");
        System.out.print("Your option:"); int option = sc.nextInt(); 
        return option;
    }
    //====================================================================
    public static void menuRun() {
        //settings
        Scanner sc = new Scanner(System.in);
        WorkerList list = new WorkerList();
        boolean quit = false; 
        //run
        while (quit == false) {            
            int option = returnOption();
            switch (option) {
                case 0: //quit
                    System.out.println("Have a great day!!"); quit = true;
                    break;
                case 1: //read file
                    list.readFromFile();
                    list.output();
                    break;
                case 2: //add more data to file (and save to file)
                    list.input();
                    break;
                case 3: //delete 1 worker's data(by id) (and save to file)
                    list.delete();
                    break;
                case 4: //sort worker ascending(by salary)
                    list.outputCompareAscending(1);
                    list.output();
                    break;
                case 5: //sort worker descending(by salary)
                    list.outputCompareAscending(0);
                    list.output();
                    break;
                case 6: //search and find worker's information(by id)
                    list.findWorkerInfor();
                    break;
                case 7: //search and change worker's information(by id)
                    list.findAndChangeWorkerInfor();
                    break;
                case 8: //Find worker have the highest salary
                    list.outputMinOrMaxSalary(1);
                    break;
                case 9: //Find worker have the lowest salary
                    list.outputMinOrMaxSalary(0);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.print("Press enter to continue..");
            String enter = sc.nextLine();
        }
    }
    
    
}
