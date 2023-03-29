/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//1) Xây dựng hàm nhập tên của sinh viên. Hàm không tham số và return tên của sinh viên
//2) Xây dựng hàm xuất ra dòng chữ “Hello <tên sinh viên>”. Hàm void có 1 tham số là tên sv
//3) Viết chương trình cho phép người dùng nhập vào tên sinh viên và xuất câu chào Hello <tên 
//sv vừa nhập> ra màn hình. Yêu cầu dùng hàm 1 và hàm 2
//4) Xây dựng hàm xuất ra hình chữ nhật gồm các ký tự ‘*’ có chiều dài và chiều rộng là số nguyên 
//bất kỳ. Hàm void có 2 tham số nguyên là chiều dài và chiều rộng
//5) Xây dựng hàm tính diện tích của hình chữ nhật. Hàm có 2 tham số nguyên là chiều dài và chiều 
//rộng, return diện tích
//6) Viết chương trình cho phép người dùng nhập chiều dài và chiều rộng. Yêu cầu dùng hàm 4 và 
//hàm 5 để vẽ hình chữ nhật với kích thước vừa nhập và xuất diện tích ra màn hình
//7) Viết hàm tính tổng các số lẻ từ 1 đến n. Hàm có 1 tham số nguyên n và return tổng các số lẻ từ
//1 đến n
//8) Viết chương trình nhập vào số nguyên dương n. Sử dụng hàm 7 để xuất ra màn hình tổng các 
//số lẻ từ 1 đến n
//9) Viết hàm tìm số lớn nhất của 2 số nguyên bất kỳ. Hàm có 2 tham số nguyên và return số lớn 
//nhất
//10) Viết hàm tìm số lớn nhất của 4 số nguyên bất kỳ sử dụng hàm 9. Hàm có 4 tham số nguyên và 
//return số lớn nhất
//a. Cách 1: không sử dụng hàm 9
//b. Cách 2: có sử dụng hàm 9
//11) Xây dựng chương trình khởi tạo 4 giá trị ngẫu nhiên (từ 0-1000). Xuất ra giá trị lớn nhất sử
//dụng hàm 10

package com.mycompany.lesson2;

/**
 *
 * @author phong
 */

import java.util.Scanner;


public class Main {

    int data;
    Main(int dataValue){
        data = dataValue;
    }
    
    public static void main(String[] args) {
//        String name = "";
//        int a = 0; int b = 0;
//        System.out.println("Hello " + printName1());
//        printName2(name);
//        String Name = inputName();
//        printName(Name);
//        rectangle(a, b);
//        System.out.println("Rectangular acreage is S = " + rectangularAcreage(a,b));
        Main n1 = new Main(1);
        Main n2 = new Main(2);
        int rectangularAcreage = rectangularAcreageResult(n1, n2);
        rectangleImage(n1,n2);
        System.out.println("Rectangular acreage is S = " + rectangularAcreage);
    }
    
    public static String inputName1() {
        String name;
        Scanner sc = new Scanner(System.in);
        //====================================
        System.out.print("Input your name: ");
        name = sc.nextLine();
        return name;
    }
    //================================================
    public static void inputName2(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        name = sc.nextLine();
        System.out.println("Hello " + name);
    }
    //================================================
    public static String inputName() {
        String name; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your name: ");
        name = sc.nextLine();
        return name;
    }
    public static void printName (String name) {
        System.out.println("Hello " + name);
    }
    //==================================================
    public static void rectangle (int a, int b) {
        Scanner sc = new Scanner(System.in);
        //==================================
        System.out.print("Input longs: ");
        a = sc.nextInt();
        System.out.print("Input width: ");
        b = sc.nextInt();
        for(int i = 1; i <= b; i++) {
            for(int k = 1; k <= a; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //=================================================
    public static int rectangularAcreage(int a, int b) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input longs: ");
        a = sc.nextInt();
        System.out.print("Input width: ");
        b = sc.nextInt();
        return (a*b);
    }
    //=================================================
    public static void rectangleImage(Main n1, Main n2) {
        for(int i = 1; i <= n2.data; i++) {
            for(int k = 1; k <= n1.data; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static int rectangularAcreageResult(Main n1, Main n2) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input longs: ");
        n1.data = sc.nextInt();
        System.out.print("Input width: ");
        n2.data = sc.nextInt();
        return (n1.data * n2.data);
    }
    //===================================================
//    public static int oddSum(int n) {}
}
