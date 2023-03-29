/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.book;
import java.util.Scanner;
/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Book b1 = new Book();
//        Book b2 = new Book("Toi tu hoc", "Nguyen Thu Giang", 1980, 120);
//        b1.input();
//        b1.output();
//        b2.output();

        int n;
        System.out.print("Input book quantity: ");
        n = sc.nextInt();
        Book arrBook[] = new Book[n];
        for(int i=0; i < n; i++) {
            arrBook[i] = new Book();
            arrBook[i].input();
        }
        for(int i=0; i < n; i++) {
            arrBook[i].output();
        }
        System.out.println("Book have the least page is " + minBookName(n, arrBook));
        System.out.println("Average of all book page: " + averageBookPage(n, arrBook));
    }
    
    
    public static String minBookName(int n,Book arrBook[]) {
        Book min = arrBook[0];
        for(int i = 1; i < n; i++) {
            if(min.getPageNmbers() > arrBook[i].getPageNmbers()) {
               min = arrBook[i]; 
            }
        }
        return min.getName();
    }
    
    public static Double averageBookPage(int n, Book arrBook[]) {
        Double average;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arrBook[i].getPageNmbers();
        }
        average = sum / n;
        average = (float)Math.round(average * 100) / 100.00; 
        return average;
    }
    
}
