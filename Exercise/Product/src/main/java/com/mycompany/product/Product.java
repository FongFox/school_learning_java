/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.product;
/**
 *
 * @author phong
 * 6) Xây dựng lớp sản phẩm (SanPham.java) bao gồm:
- Mã sản phẩm, Tên sản phẩm, Đơn vị tính, Giá và Hạn sử dụng (chỉ ghi năm kiểu int)
- Constructor: 0 tham số và 4 tham số
- Hàm xuất sản phẩm sao cho thông tin 1 sản phẩm là 1 dòng bao gồm 5 thông tin trên cách nhau bởi dấu chấm phẩy (;)
Ví dụ: 001; Sữa Milo; Lốc; 25; 2023
- Hàm kiểm tra hạn sử dụng, nếu hạn sử dụng nhỏ hơn năm hiện tại thì return “Đã hết hạn”, ngược lại return “Chưa hết hạn”
- Hàm tính thành tiền có 1 tham số soluong (int): return thành tiền (gia*soluong)
Hàm main():
a) Tạo ra 3 sản phẩm khác nhau và xuất thông tin 3 sản phẩm này ra màn hình kèm thông tin hết hạn hoặc Chưa hết hạn. Ví dụ: 001; Sữa Milo; Lốc; 25; 2023 (Chưa hết hạn)
b) Giả sử khách hàng mua 3 sản phẩm trên với số lượng lần lượt là 2, 7 và 5. Tính tổng tiền cần trả
 */
import java.util.Scanner;
public class Product {
    //fields
    private String id;
    private String name;
    private String unit;
    private int price;
    private int bestBeforeYear;
    //constructor
    public Product() {
        
    }
    public Product(String id, String name, String unit, int price, int bestBeforeYear) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.bestBeforeYear = bestBeforeYear;
    }
    //methods
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input product id: ");
        this.id = sc.nextLine();
        System.out.print("Input product name: ");
        this.name = sc.nextLine();
        System.out.print("Input product unit: ");
        this.unit = sc.nextLine();
        System.out.print("Input product price: ");
        this.price = sc.nextInt();
        System.out.print("Input product best before (year): ");
        this.bestBeforeYear = sc.nextInt();
    }
    public void output() {
        System.out.println(this.id + "; " + this.name + "; " + this.unit + "; " + this.price + "; " + this.bestBeforeYear + " " + "(" + checkBestBefore() + ")");
    }
    public String checkBestBefore() {
        int currentYear = 2022;
        if(this.bestBeforeYear < currentYear) 
            return "Da het han!";
        else return "Chua het han!";
    }
    public int getPrice(int quantity) {
        int totalPrice = this.price * quantity;
        return totalPrice;
    }
    public void outputBill(int quantity, int number) {
        System.out.println("Bill");
        System.out.println(number + "\t" + this.name + "\t" );
    }
}
