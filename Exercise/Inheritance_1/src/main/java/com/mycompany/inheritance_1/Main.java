/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inheritance_1;

/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        //Tính chu vi và diện tích và chu vi hình chữ nhật (10,3). Tính diện tích và thể tích của hình hộp (2,4,6)Tính chu vi và diện tích và chu vi hình chữ nhật (10,3). Tính diện tích và thể tích của hình hộp (2,4,6)
        Rectangle r = new Rectangle(2.0,3.0);
        Box b = new Box(4.0, 5.0, 6.0);
        
        System.out.println("P=" + r.perimeter());
        System.out.println("S=" + r.area());
        
        System.out.println("V=" + b.volume());
        System.out.println("S=" + b.area());
    }
}
