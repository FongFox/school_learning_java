/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_1;

import java.util.Scanner;

/**
 *
 * @author phong
 * 2. Xây dựng lớp hình hộp (Box) kế thừa Rectangle, định nghĩa thêm các thành viên:
- 
- 
-  
- 
- 
- 
- 
3. 
 */
public class Box extends Rectangle {
    //height: private
    private Double heigth;
    //constructors 0 tham số và 3 tham số: nếu heigth là số âm thì mặc định bằng 0
    public Box() {
        
    }
    public Box(Double length, Double width, Double heigth) {
        super(length, width);
        if(heigth < 0) this.heigth = 0.0;
        else this.heigth = heigth;
    }
    //getters, setters: nếu heigth là số âm thì mặc định bằng 0
    public Double getHeight() {
        return heigth;
    }
    public void setHeight(Double heigth) {
        if(heigth < 0) this.heigth = 0.0;
        else this.heigth = heigth;
    }
    //methods
    //hàm nhập length, width và height
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Input height: ");
        Double h = sc.nextDouble();
        setHeight(h);
    }
    //Hàm tính thể tích volume(): length*width* heigth
    public Double volume() {
        return super.length * super.width* this.heigth;
    }
    //override hàm tính diện tích area(): 2 (length*width+ width*heigth+heigth*length)
    @Override
    public Double area() {
        return 2*(length*width+ width*heigth+heigth*length);
    }
    //override hàm toString(): return chuỗi thông tin length, width, heigth
    @Override
    public String toString() {
        return super.toString() + "||" + "heigth: " + this.heigth;
        
    }
}
