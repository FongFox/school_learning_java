/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson4;

import java.util.Scanner;

/**
 *
 * @author phong
 */
public class Sinhvien {
    private int maSo;
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
    public int getMaSo() {
        return maSo;
    }
    //=================================
    private String hoTen;
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }
    //======================================
    private int namSinh;
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public int getNamSinh() {
        return namSinh;
    }
    //======================================
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so sinh vien: ");
        this.namSinh = sc.nextInt();
        String clone = ""; clone = sc.nextLine();
        System.out.println("Nhap ten sinh vien: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhap nam sinh: ");
        this.namSinh = sc.nextInt();
    }
    public void xuat() {
        System.out.println("Ma so: " + this.maSo + "|Ten: " + this.hoTen + "|Nam sinh: " + this.namSinh);
    }
}
