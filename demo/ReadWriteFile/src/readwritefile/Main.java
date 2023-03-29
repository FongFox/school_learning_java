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
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Ghi 1 doi tuong xuong file
        Student stud1 = new Student(100, "NTThanh");
        try {
            FileWriter fw = new FileWriter("Students.txt", true);
            fw.write(stud1.toString());
            fw.close();
            System.out.println("Da ghi 1 doi tuong xuong file");
        }catch (Exception ex){
            System.out.println("Khong the luu file");
            System.out.println(ex.getMessage());
        }
        
        //Ghi 1 danh sach doi tuong (list) xuong file
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(200, "Name 200"));
        list.add(new Student(300, "Name 300"));
        list.add(new Student(400, "Name 400"));
        list.add(new Student(500, "Name 500"));
        
        try {
            FileWriter fw = new FileWriter("Students.txt", true);
            for (Student stud : list) {
                fw.write(stud.toString());
            }
            fw.close();
            System.out.println("Da ghi danh sach doi tuong xuong file");
        }catch (Exception ex){
            System.out.println("Khong the luu file");
            System.out.println(ex.getMessage());
        }
        
        //Đọc file và xuất ra màn hình
        try {
            FileReader fr = new FileReader("Students.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String s;
            while ((s = br.readLine()) != null){
                String arr[] = s.split(",");
                int id = Integer.parseInt(arr[0].trim());
                String name = arr[1].trim();
                Student stud = new Student(id, name);
                stud.output();
            }
            fr.close();
            br.close();
            
        }catch (Exception ex){
            System.out.println("Khong the doc file");
            System.out.println(ex.getMessage());
        }
    }
}
