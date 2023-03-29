/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic;

/**
 *
 * @author Thanh
 */
public class TanSinhvien {
    // 1.BIẾN Static: giống nhau cho tất cả đối tượng
    // 2.HÀM Static: không truy xuất TRỰC TIẾP đến biến non-static 
    //               không gọi TRỰC TIẾP hàm non-static
    // 3.HẰNG SỐ
    final String JAVA_SLOGAN = "Write once, run anywhere"; // final: cấm thay đổi
    static final String JAVA_SLOGAN2 = "Write once, run anywhere"; //static: vì giống nhau cho tất cả đối tượng
    public static final String JAVA_SLOGAN3 = "Write once, run anywhere"; //không cần get/set
    
    // 4.BIẾN Static làm biến TOÀN CỤC của ứng dụng
    private static int dem=0; //đếm số lượng sv
    
    private String ten; // non-static
    private static int namsinh = 2000; // Static vì tân sv có cùng năm sinh

    public static int getDem() {
        return dem;
    }

    public TanSinhvien() {
        dem++; //đếm số lượng sv
    }
    
    public TanSinhvien(String ten) {
        this.ten = ten;
        dem++; //đếm số lượng sv
    }
    
    //non-static
    public void xinchao(){
        System.out.println(ten.toUpperCase() + " xin chào mọi người!");
    }
    
    // static method
    public void helloWorld(){
        System.out.println("Hello World!!!");
    }
    
    // HỎI CÁC HÀM SAU CÓ PHẢI STATIC KHÔNG
    public static void xinchao(String ten){
        System.out.println("Xin chao ban " + ten);
    }
    
    public static void xuatTuoi(int namnay){
        int tuoi = namnay - namsinh;
        System.out.println("Tuoi cua ban la: " + tuoi);
    }
    
    public void xuat(){
        xinchao(); //non-static: gọi trực tiếp
        xuatTuoi(2022); //static
    }
    
    public void xuat2(){
        TanSinhvien tsv1 = new TanSinhvien("NTThanh");
        tsv1.xinchao(); //non-static: gọi thông qua đối tượng
        xuatTuoi(2022); //static
    }
}
