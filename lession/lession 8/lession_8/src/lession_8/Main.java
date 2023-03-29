/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession_8;

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
        ArrayList<Sinhvien> list = new ArrayList<Sinhvien>();
        
        list.add(new Sinhvien("1", "Nguyen Van", "A", 2000));
        list.add(new Sinhvien("1", "Nguyen Van", "B", 2001));
        list.add(new Sinhvien("1", "Nguyen Van", "C", 2002));
        list.add(new Sinhvien("1", "Nguyen Van", "D", 2003));
        list.add(new Sinhvien("1", "Nguyen Van", "E", 2004));
        
        
    }
    
}
