/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.book;
import java.util.Scanner;
/**
 *
 * @author phong
 * 7) Thông tin của 1 cuốn sách bao gồm: tên sách, tác giả, năm xuất bản và số trang. Viết chương trình tạo dữ liệu cho 5 cuốn sách và xuất thông tin của 5 cuốn sách ra màn hình
- class Sach: fields, constructors, methods
- hàm main: tạo 5 đối tượng Sach và xuất thông tin ra màn hình
 */
public class Book {
    // fields
    private String name;
    private String authorName;
    private int publishYear;
    private int pageNumbers;
    // constructor
    public Book () {
        
    }
    public Book(String name, String authorName, int publishYear, int pageNumbers) {
        this.name = name;
        this.authorName = authorName;
        this.publishYear = publishYear;
        this.pageNumbers = pageNumbers;
    }
    //get,set
    public void setPageNumbers (int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }
    public int getPageNmbers () {
        return this.pageNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // methods
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input book name: ");
        this.name = sc.nextLine();
        System.out.print("Input author name: ");
        this.authorName = sc.nextLine();
        System.out.print("Input book publish year: ");
        this.publishYear = sc.nextInt();
        System.out.print("Input book page numbers: ");
        this.pageNumbers = sc.nextInt();
    }
    public void output() {
        System.out.println(this.name + "||" + this.authorName + "||" + this.publishYear + "||" + this.pageNumbers);
    }
    
}
