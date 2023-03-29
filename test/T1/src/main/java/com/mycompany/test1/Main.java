/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.test1;
import java.util.Scanner;
/**
 *
 * @author phong
 */
public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong nhan vien: ");
        n = sc.nextInt();
        Nhanvien nv[] = new Nhanvien[n];
        for(int i=0; i < n; i++) {
            nv[i] = new Nhanvien();
            nv[i].nhap();
        }
        xuat(n, nv);
        xuatLuong(n, nv);
        inMaxLuong(n, nv);
    }
    
    public static void xuat(int n ,Nhanvien nv[]) {
        for(int i = 0; i < n; i++) {
            nv[i].xuat();
        }
    }
    
    public static void xuatLuong(int n, Nhanvien nv[]) {
        for(int i = 0; i < n; i++) {
            System.out.println("Tong luong nhan vien " + i + " duoc nhan la: " + nv[i].tinhLuong());
        }
    }
    
    public static String maxLuong(int n, Nhanvien nv[]) {
        Nhanvien max = nv[0];
        for(int i=1; i<n; i++) {
            if(max.tinhLuong() < nv[i].tinhLuong()) {
                max = nv[i];
            }
        }
        return max.getName();
    }
    
    public static void inMaxLuong (int n, Nhanvien nv[]) {
        System.out.println("Nhan vien co so luong cao nhat: " + maxLuong(n, nv));    
    }
}
