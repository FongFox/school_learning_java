/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson7;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while(quit != true) {
            int choice;
            System.out.println("1.Convert C to F");
            System.out.println("2. Convert F to C");
            System.out.println("3. Convert Inch to Cm");
            System.out.println("4. Convert Foot to M");
            System.out.print("Input your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Quitting !!"); quit = true;
                    break;
                case 1:
                    Double c;
                    System.out.print("Input c: ");
                    c = sc.nextDouble();
                    System.out.println("C to F = " + Convert.cToF(c));
                    break;
                case 2:
                    Double f;
                    System.out.print("Input f: ");
                    f = sc.nextDouble();
                    System.out.println("C to F = " + Convert.fToC(f));
                    break;
                case 3:
                    Double inch;
                    System.out.print("Input inch: ");
                    inch = sc.nextDouble();
                    System.out.println("Inch to cm = " + Convert.inchToCm(inch));
                    break;
                case 4:
                    Double foot;
                    System.out.print("Input foot: ");
                    foot = sc.nextDouble();
                    System.out.println("Inch to cm = " + Convert.footToM(foot));
                    break;
                default:
                    System.out.println("Error!");
            }
        }
    }
}
