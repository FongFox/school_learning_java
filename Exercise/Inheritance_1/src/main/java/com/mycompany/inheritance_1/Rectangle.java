/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_1;
import java.util.Scanner;
/**
 *
 * @author phong
 * 1. Xây dựng lớp hình chữ nhật (Rectangle) bao gồm



- 
- 
- 
- 
 */
public class Rectangle {
    //- length, width: protected
    protected Double length;
    protected Double width;
    //- constructors 0 tham số và 2 tham số: nếu length và width là số âm thì mặc định bằng 0
    public Rectangle() {
        
    }
    public Rectangle(Double length, Double width) {
        if(length < 0) this.length = 0.0;
        else this.length = length;
        if(width < 0) this.width = 0.0;
        else this.width = width;
    }
    //- getters, setters: nếu length và width là số âm thì mặc định bằng 0
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        if(this.length < 0) this.length = 0.0;
        else this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        if (this.width < 0) this.width = 0.0;
        else this.width = width;
    }
    //methods
    //hàm nhập length, width
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input length: ");
        Double l = sc.nextDouble();
        setLength(l);
        System.out.print("Input width: ");
        Double w = sc.nextDouble();
        setWidth(w);
    }
    //hàm tính chu vi perimeter()
    public Double perimeter() {
        return (this.length + this.width) * 2;
    }
    //hàm tính diện tích area(): length*width
    public Double area() {
        return this.length * this.width;
    }
    //override hàm toString(): return chuỗi thông tin length, width
    @Override
    public String toString() {
        return "length: " + this.length + "||" + "width: " + this.width;
    }
}
