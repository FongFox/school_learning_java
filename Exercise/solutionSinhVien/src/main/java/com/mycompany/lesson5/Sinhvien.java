/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson5;

/**
 *
 * @author phong
 */
import java.util.Scanner;
public class Sinhvien {
    // biến private
    private int maso;
    private String hoten;
    private int namsinh;
    
    // hàm get/set public
    public int getMaso(){
        return maso;
    }
    public void setMaso(int maso){
        this.maso = maso;
    }
    public String getHoten(){
        return hoten;
    }
    public void setHoten( String hoten){
        this.hoten = hoten;
    }
    public int getNamsinh(){
        return namsinh;
    }
    public void setNamsinh(int namsinh){
        this.namsinh = namsinh;
    }
    
    // hàm nhap: yêu cầu nhập đầy đủ maso, namsinh và hoten
    public void nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap ma so sv: ");
       maso = sc.nextInt();
       System.out.print("Nhap ho ten: ");
       hoten = sc.nextLine();
       hoten = sc.nextLine();
       System.out.print("Nhap nam sinh: ");
       namsinh = sc.nextInt();
       
    }
    // hàm xuat: xuất 1 dòng theo định dạng sau <maso>_<hoten>_<namsinh>
    public void xuat(){
        System.out.println(maso + "_" + hoten +"_"+namsinh);
    }
}

