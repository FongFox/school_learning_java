/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson7;
import java.util.Scanner;
/**
 *
 * @author phong
 * Xây dựng lớp Converter bao gồm các phương thức sau. Hỏi phương thức nào có thể là static, vì sao?
- Chuyển đổi từ độ C sang độ F và ngược lại theo công thức
°F = ( °C × 1.8 ) + 32
°C = ( °F ─ 32 ) ⁄ 1.8
- Chuyển đổi giữa inch và cm: 1 inch = 2.54 cm
- Chuyển đổi giữa foot và m: 1 foot = 0.3048 m
- Hàm main() thực hiện việc chuyển đổi dữ liệu được nhập vào từ người dùng

 */
public class Convert {
    //fields
    //constructor
    public Convert() {
        
    }
    //get,set
    //methods
    public static Double cToF(Double c) {
        Double f = (c * 1.8) + 32;
        return f;
    }
    public static Double fToC(Double f) {
        Double c = (f - 32) * 1.8;
        return c;
    }
    public static Double inchToCm(Double inch) {
        Double cm = inch * 2.54;
        return cm;
    }
    public static Double footToM(Double foot) {
        Double m = foot * 0.3048;
        return m;
    }
    
}
