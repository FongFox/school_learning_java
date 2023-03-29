/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson5;

/**
 *
 * @author phong
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int id; String name; int birthYear; String address;
        Scanner sc = new Scanner(System.in);
        //Person 1
        Person p1 = new Person();
        p1.input();
        p1.sayHello();
        //Person 2
        Person p2 = new Person(1, "Phong", 2002, "449/18");
        p2.sayHello();
    }
}
