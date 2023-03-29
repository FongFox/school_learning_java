/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baikiemtra;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tạo 2 đối tượng Sinhvien
        Sinhvien sv1 = new Sinhvien();
        Sinhvien sv2 = new Sinhvien();
        
        //Tạo thông tin cho sv1
        sv1.setMaso(22013065);
        sv1.setNamsinh(2002);
        sv1.setHoten("Vo Dang Van");
        
        //Nhập thông tin của sv2 từ người dùng
        System.out.println("Nhap thong tin cua sinh vien 2:");
        sv2.nhap();
        
        //Xuất 2 sinh vien
        System.out.println("--------------------------------------");
        System.out.println("Thong tin của 2 sinh vien");
        sv1.xuat();
        sv2.xuat();

    }
}
    
