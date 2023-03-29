/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession_8;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Sinhvien implements Comparable<Sinhvien>{
    private String mssv, ho, ten;
    private int namSinh;
    public Sinhvien() {
        
    }
    public Sinhvien(String mssv, String ho, String ten, int namSinh) {
        this.mssv = mssv;
        this.ho = ho;
        this.ten = ten;
        this.namSinh = namSinh;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mssv: ");
        this.mssv = sc.nextLine();
        System.out.print("Nhap ho sinh ien: ");
        this.ho = sc.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = sc.nextInt();
    }
    @Override
    public String toString() {
        return this.mssv + "\t\t" + this.ho + " " + this.ten + "\t\t" + this.namSinh;
    }
    public void output() {
        System.out.println(toString());
    }
    public int compareTo() {
        
    }

    @Override
    public int compareTo(Sinhvien t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
