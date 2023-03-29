/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test1;
import java.util.Scanner;
/**
 *
 * @author phong
 * Xây dựng lớp nhân viên, đặt tên lớp là Nhanvien bao gồm
3. Mã số nhân viên, họ tên, lương cơ bản và số năm làm việc
4. Constructor 0 tham số, 2 tham số (mã số, họ tên) và 4 tham số
5. Hàm nhập thông tin nhân viên, đặt tên hàm là nhap
6. Hàm xuất tất cả thông tin của nhân viên thành 1 dòng cách nhau dấu phẩy, ví dụ: NV001, Nguyen Thi Thanh, 30, 10. Đặt tên hàm là xuat
7. Hàm tính lương như sau: lương thực nhận = lương cơ bản + thưởng. Đặt tên hàm là tinhLuong, hàm trả về lương thực nhận
- Nếu số năm kinh nghiệm trên 10 năm thì thưởng = 10
- Nếu số năm kinh nghiệm trên 5 năm thì thưởng = 5
- Trường hợp còn lại thì thưởng = 2
Xây dựng hàm main thuộc lớp Main bao gồm:
8. Tạo 3 nhân viên dùng constructor 0 tham số, 2 tham số và 4 tham số. Định nghĩa đầy đủ các thông tin về mã số nhân viên, họ tên, lương cơ bản và số năm kinh nghiệm cho 3 nhân viên này
9. Tính tổng số tiền cần phải trả lương cho 3 nhân viên này
10. Tìm nhân viên có lương thực nhận cao nhất
 */
public class Nhanvien {
    //field (Mã số nhân viên, họ tên, lương cơ bản và số năm làm việc)
    private String id;
    private String name;
    private int salary;
    private int workingYear;
    //constructor (Constructor 0 tham số, 2 tham số (mã số, họ tên) và 4 tham số)
    public Nhanvien () {
        
    }
    public Nhanvien (String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Nhanvien (String id, String name, int salary, int workingYear) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.workingYear = workingYear;
    }
    //getter, setter

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    
    //methods ()
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input worker id: ");
        this.id = sc.nextLine();
        System.out.print("Input worker name: ");
        this.name = sc.nextLine();
        System.out.print("Input worker salary: ");
        this.salary = sc.nextInt();
        System.out.print("Input worker working years: ");
        this.workingYear = sc.nextInt();
    }
    public void xuat() {
        System.out.println(this.id + ", " + this.name + ", " + this.salary + ", " + this.workingYear);
    }
    public int tinhLuong() {
//        int over10Years = 10;
//        int over5Years = 5;
//        int less5Years = 2;
        int totalSalary;
        int bonusYear;
        if(this.workingYear >= 10) bonusYear = 10;
        else if(this.workingYear >= 5) bonusYear = 5;
        else bonusYear = 2;
        
        return totalSalary = this.salary + bonusYear;
    }
    
}
