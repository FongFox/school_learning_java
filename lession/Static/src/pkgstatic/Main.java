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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 5. GỌI HÀM STATIC: <Tên lớp>.<Tên hàm>
        TanSinhvien sv1 =  new TanSinhvien("nvmAnh");
        TanSinhvien sv2 =  new TanSinhvien("phtAnh");
        TanSinhvien sv3 =  new TanSinhvien("ldAnh");

        //gọi hàm
        System.out.println(TanSinhvien.JAVA_SLOGAN2);
        System.out.println(TanSinhvien.JAVA_SLOGAN3);
        System.out.format("Xin chào %d tân sinh viên!!!\n", TanSinhvien.getDem());
        
        sv1.xinchao();
        sv2.xinchao();
        sv3.xinchao();
        
        //-------------------------------------------
        double c=10.5;
        double f=Converter.cToF(c);
//        Converter conv = new Converter();
        System.out.println("-------------------------------------");
        System.out.format("%.1f°C tuong ung voi %.1f°F\n", c,f);
    }
    
}
