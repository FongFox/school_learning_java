/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex_7_7;
import java.util.Scanner;
/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input number product: ");
        n = sc.nextInt();
        Product p[] = new Product[n];
        for(int i = 0; i < n; i++) {
            p[i] = new Product();
            p[i].input();
        }
        
        for(int i =0; i < n; i++) {
            p[i].output();
        }
        Product.outputTotalAll();
    }
}
