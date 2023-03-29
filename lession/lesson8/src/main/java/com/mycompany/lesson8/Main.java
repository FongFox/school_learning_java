/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson8;
import java.io.FileWriter;
/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("output.doc");
            myFile.write("Hello World from java!!\n");
            myFile.write("Hello World from java!!\n");
            myFile.close();
        } catch (Exception e) {
            System.out.println("Exception Error: " + e.getMessage());
        }
    }
}
