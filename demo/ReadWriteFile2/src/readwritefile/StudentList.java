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
 * @author Thanh
 */
public class StudentList extends ArrayList<Student> {

    public void output() {
        for (Student stud : this) {
            stud.output();
        }
    }

    public void readFromFile(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String s;
            while ((s = br.readLine()) != null) {
                String arr[] = s.split(",");
                int id = Integer.parseInt(arr[0].trim());
                String name = arr[1].trim();
                Student stud = new Student(id, name);
                this.add(stud);
            }
            fr.close();
            br.close();

        } catch (Exception ex) {
            System.out.println("Khong the doc file");
            System.out.println(ex.getMessage());
        }
    }

    public void deleteStudent(int studentId) {
        int foundFlag = 0;
        for (Student stud : this) {
            if (stud.getId() == studentId) {
                this.remove(stud);
                System.out.format("Da xoa Student %d ra khoi danh sach\n", studentId);
                foundFlag = 1;
                break; // chỉ xóa phần tử đầu tiên
            }
        }
        if (foundFlag == 0) {
            System.out.format("Student %d khong co trong danh sach\n", studentId);
        }
    }
    
    public void saveToFile(String fileName, boolean append){
         try {
            FileWriter fw = new FileWriter("Students.txt", append); // ghi đè
            for (Student stud : this) {
                fw.write(stud.toString());
            }
            fw.close();
            System.out.println("Da ghi danh sach xuong file");
        }catch (Exception ex){
            System.out.println("Khong the luu file");
            System.out.println(ex.getMessage());
        }
    }
}
