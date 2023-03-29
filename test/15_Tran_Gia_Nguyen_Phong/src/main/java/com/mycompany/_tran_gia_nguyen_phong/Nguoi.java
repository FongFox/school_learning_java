/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._tran_gia_nguyen_phong;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Nguoi {
    //hoten, namsinh, diachi
    protected String name, address;
    protected int yearBirth;
    //Constructor 0 tham số và 3 tham số
    public Nguoi() {
        super();
    }
    public Nguoi(String name, int yearBirth, String address) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.address = address;
    }
    //get, set
    //Hàm toString(): trả về chuỗi bao gồm hoten, namsinh, diachi (định dạng tùy chọn)
    @Override
    public String toString() {
        return this.name + "\t\t" + this.yearBirth + "\t\t" + this.address;
    }
    //Hàm nhap(): cho phép người dùng nhận hoten, namsinh và diachi
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        this.name = sc.nextLine();
        System.out.print("Input year birth: ");
        this.yearBirth = sc.nextInt();
        String enter = sc.nextLine();
        System.out.print("Input address: ");
        this.address = sc.nextLine();
    }
    //Hàm xuat(): xuất 1 dòng bao gồm hoten, namsinh và diachi
    public void output() {
        System.out.println(toString());
    }
    //Hàm void thongBaoKhenThuong(): xuất thông báo “Chưa có thông tin khen thưởng”
    public void thongBaoKhenThuong() {
        System.out.println("Chua co thong tin khen thuong!");
    }
}
