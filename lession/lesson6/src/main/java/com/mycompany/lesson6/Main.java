/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson6;

/**
 *
 * @author phong
 * Dùng kiểu dữ liệu đối tượng
- Xây dựng lớp Font bao gồm int fontSize, string fontName, constructors, getters, setters và void output(): xuất fontSize và fontName
- Xây dựng lớp WebPage bao gồm title, language và Font fontWebPage, constructors và void output(): xuất title, language, fontSize, fontName của WebPage
- Tạo đối tượng WebPage và xuất thông tin của WebPage ra màn hình
 */
public class Main {

    public static void main(String[] args) {
        Webpage wp = new Webpage();
        wp.output();
    }
}
