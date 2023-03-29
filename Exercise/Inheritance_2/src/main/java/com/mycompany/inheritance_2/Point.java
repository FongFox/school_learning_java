/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance_2;
import java.util.Scanner;
/**
 *
 * @author phong
 * 1. Xây dựng lớp Point bao gồm:
- Tọa độ x, y: protected
- Hàm nhập x, y
- Contrctor 0 tham số và 2 tham số
- override hàm toString(): return chuỗi có định dạng (x,y)
- Hàm xuất tọa độ

 */
public class Point {
    //fields
    protected int x;
    protected int y;
    //constructor
    public Point() {
        
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //get, set
    //methods
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input x: ");
        this.x = sc.nextInt();
        System.out.print("input y: ");
        this.y = sc.nextInt();
    }
    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
    public void output() {
        System.out.println("Coordinates " + toString());
    }
}

