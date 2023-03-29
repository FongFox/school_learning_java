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
public class Sinhvien extends Hocsinh {
    //Nghiên cứu khoa học (nckh): bằng 1 nếu có NCKH và bằng 0 nếu không NCKH
    private int nckh;
    //Constructor 0 tham số và 5 tham số
    public Sinhvien() {
        super();
    }
    public Sinhvien(String name, int yearBirth, String address, Double average, int nckh) {
        super(name, yearBirth, address, average);
        this.nckh = nckh;
    }
    //get, set
    //methods
    @Override
    public String toString() {
        return super.toString() + "\t\t" + this.nckh;
    }
    //Override hàm nhap() và hàm xuat()
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Co bang nghien cuu khoa hoc khong ? (1 co || 0 khong): ");
        nckh = sc.nextInt();
    }
    @Override
    public void output() {
        System.out.println(toString());
    }
    //Override hàm thongBaoKhenThuong()
    @Override
    public void thongBaoKhenThuong() {
        if(this.nckh == 1 && super.khenThuong() == true)
            System.out.println("Sinh vien " + super.name + " duoc khen thuong!");
        else 
            System.out.println("Sinh vien " + super.name + " khong duoc khen thuong!");
    }
}
