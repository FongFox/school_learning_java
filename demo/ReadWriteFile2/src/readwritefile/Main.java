/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // đọc file và xuất ra màn hình
        StudentList studList = new StudentList();
        studList.readFromFile("Students.txt");
        studList.output();
        
        System.out.println("------------------------------");
        // xóa 1 đối tượng ra khỏi file
        studList.deleteStudent(500);
        studList.saveToFile("Students.txt", false);
        studList.output();
    }
}
