/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._tran_gia_nguyen_phong;

import java.util.ArrayList; 

/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Nguoi> list = new ArrayList<Nguoi>();
        
        list.add(new Hocsinh("A", 2000, "A", 8.7));
        list.add(new Hocsinh("B", 1990, "B", 9.0));
        list.add(new Sinhvien("C", 2002, "C", 9.5, 1));
        list.add(new Sinhvien("D", 2002, "D", 8.5, 1));
        list.add(new Sinhvien("E", 2002, "E", 9.5, 0));

        for (Nguoi ls : list) {
            ls.output();
            ls.thongBaoKhenThuong();
        }
    }
}
