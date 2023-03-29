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
public class Hocsinh extends Nguoi {
    //Điểm trung bình (dtb)
    private Double average;
    //Constructor 0 tham số và 4 tham số
    public Hocsinh() {
        super();
    }
    public Hocsinh(String name, int yearBirth, String address, Double average) {
        super(name, yearBirth, address);
        this.average = average;
    }
    //get, set

    public Double getAverage() {
        return average;
    }
    
    //Hàm toString(): trả về chuỗi bao gồm hoten, namsinh, diachi, dtb (định dạng tùy chọn)
    @Override
    public String toString() {
        return super.toString() + "\t\t" + this.average;
    }
    //Override hàm nhap() và hàm xuat()
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Input average: ");
        this.average = sc.nextDouble();
    }
    @Override
    public void output() {
        System.out.println(toString());
    }
    //Hàm boolean khenThuong(): Nếu dtb >=9: return true (được khen thưởng), ngược lại return false (không được khen thưởng)
    public boolean khenThuong() {
        return this.average >= 9;
    }
    //Override hàm thongBaoKhenThuong()
    @Override
    public void thongBaoKhenThuong() {
        if(khenThuong() == true) 
            System.out.println("Hoc sinh " + super.name + " duoc khen thuong!");
        else 
            System.out.println("Hoc sinh " + super.name + " khong duoc khen thuong!");
    }
}
