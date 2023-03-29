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
public class Converter {
    
    // CẤM new đối tượng từ lớp khác
    private Converter(){    
    }

    // Bắt buộc gọi hàm: <Tên lớp>.<Tên hàm>
    public static double cToF(double doC) {
        double doF=0;
        
        // °F  =  ( °C × 1.8 ) +  32
        doF = doC*1.8+32;
        return doF;
    }
}
