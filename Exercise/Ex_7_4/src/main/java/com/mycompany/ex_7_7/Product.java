/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_7_7;
import java.util.Scanner;
/**
 *
 * @author phong
 * 4) Xây dựng lớp sản phẩm (SanPham.java) bao gồm
- Mã, tên, giá, số lượng 
- Constructor 4 tham số
- Biến tĩnh tổng tiền bằng tổng thành tiền của tất cả các sản phẩm được tạo ra
- Getters và setters cho tất cả các biến private
- Phương thức xuat(): tên, giá, số lượng và thành tiền
- Hàm main() tạo ra n sản phẩm và xuất n sản phẩm cùng tổng tiền.
 */
public class Product {
    //fields
    private String id;
    private String name;
    private int price;
    private int quantity;
//    private static int totalAll;
    public static int totalAll;
    //constructors
    public Product() {
        
    }
    public Product (String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //get,set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //methods
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input porduct id: ");
        this.id = sc.nextLine();
        System.out.print("Input product name: ");
        this.name = sc.nextLine();
        System.out.print("Input product price: ");
        this.price = sc.nextInt();
        System.out.print("input product quantity: ");
        this.quantity = sc.nextInt();
        totalAll += (this.price * this.quantity);
    }
    
    public void output() {
        System.out.println(this.id + "||" + this.name + "||" + this.price + "||" + this.quantity);
    }
    
    public static void outputTotalAll() {
        System.out.println("Total price all porduct: " + totalAll);
    }
}
