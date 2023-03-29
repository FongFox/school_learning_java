/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_2;

import java.util.Scanner;

/**
 *
 * @author phong
 * 2. Xây dựng lớp Circle kế thừa lớp Point, và định nghĩa thêm các fileds và methods sau:
- Bán kính (radius): private
- Màu (color): private
- Hàm nhập x, y, bán kính và màu
- Constructor 0 tham số và 4 tham số (có chỉ định constructor 2 tham số của lớp cha)
- Hàm vẽ (draw): xuất ra nội dung: “Hình tròn có bán kính…………, màu…………, được vẽ tại tọa độ…………”
- Hàm tính diện tích (area) và hàm tính chu vi (perimeter)
- override hàm toString(): return chuỗi có định dạng (x,y)-radius-color
- Hàm xuất (x,y)-radius-color
3. Vẽ 3 hình tròn khác nhau và xuất chu vi, diện tích của 3 hình tròn này
 */
public class Circle extends Point {
    //fields
    private Double radius;
    private String color;
    private final Double PI = 3.14;
    public static int count = 0;
    //constructor
    public Circle() {
        
    }
    public Circle(int x, int y, Double radius, String color) {
        super(x,y);//constructor
        this.radius = radius;
        this.color = color;
        count++;
    }
    //get, set
    //methods
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Input radius: ");
        this.radius =sc.nextDouble();
        String enter = sc.nextLine();
        System.out.print("input color: ");
        this.color = sc.nextLine();
    }
    public void draw() {
        System.out.println("This circle have radius: " + this.radius + ", color: " + this.color + ", was drawn at " + super.toString());
    }
    public Double perimeter() {
        Double p;
        return p = radius * PI; 
    }
    public Double area() {
        Double s;
        return s = Math.pow(radius, radius) * PI;
    }
    @Override
    public String toString() {
        return super.toString() + "-" + this.radius + "-" + this.color;
    }
}
