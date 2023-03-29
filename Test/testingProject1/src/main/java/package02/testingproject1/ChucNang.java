package package02.testingproject1;


import java.util.*;

/**
 * 
 */
public class ChucNang {

    /**
     * Default constructor
     */
    public ChucNang() {
    }

    /**
     * 
     */
    public void ChonChucNang() {
        // TODO implement here
       String Ma = "";
       String Ten = "";
       String GioiTinh = "";
       int NamSinh = 0;
       NhanVien n1 = new NhanVien();
       n1.Nhap(Ma, Ten, GioiTinh, NamSinh);
       //======================
       int Luong = 0;
       Luong l1 = new Luong();
       l1.Nhap(Luong);
       //====================
       ThuVien lib1 = new ThuVien();
       TapTin file = new TapTin();
       boolean KQNV = lib1.KiemTraNhanVien(Ma, Ten, GioiTinh, NamSinh);
       boolean KQL = lib1.KiemTraLuong(Luong);
       if(KQNV == true && KQL == true)
           file.TaoFile();
           
    }

}