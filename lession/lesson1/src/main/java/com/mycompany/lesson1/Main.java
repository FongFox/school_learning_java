/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lesson1;

/**
 *
 * @author phong
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    static void printTheirNameAndAge() 
    {
        String name; int birthYear; int currentAge; int currentYear = 2022; int age2020;
        Scanner sc = new Scanner(System.in);
        //============================================================
        System.out.print("Input your name: ");
        name = sc.nextLine();
        System.out.print("Input your year of birth: ");
        birthYear = sc.nextInt();
        //=======================
        currentAge = currentYear - birthYear;
        //=======================
        age2020 = 2020 - birthYear;
        //=======================
        System.out.println("Hello " + name);
        System.out.println("Your current age: " + currentAge);
        System.out.println("Your 2020 age: " + age2020);
    }
    
    static void printText()
    {
        String fName1; String lName1; String fName2; String lName2;
        Scanner sc = new Scanner(System.in);
        //============================================================
        System.out.print("Input your first name 1: ");
        fName1 = sc.nextLine();
        System.out.print("Input your last name 1: ");
        lName1 = sc.nextLine();
        //===========================================
        System.out.print("Input your first name 2: ");
        fName2 = sc.nextLine();
        System.out.print("Input your last name 2: ");
        lName2 = sc.nextLine();
        //============================================
        System.out.println("Than goi " + fName1 + " " + lName1 + "!");
        System.out.println("Nhap dip sinh nhat cua " + lName1 + " , cho phep " + lName2 + " goi den " + lName1 + " nhung loi chuc tot dep nhat ve suc khoe, hanh phuc va thanh cong trong moi linh vuc.");
        System.out.println("Goi loi tham suc khoe hai bac cua " + lName1 + "."); System.out.println("");
        System.out.println("Ban cua " + lName1 +".");
        System.out.println(fName2 + " " + lName2);System.out.println("");
        System.out.println("TB: Ba ma " + lName2 + " thuong nhac den " + lName1 + " luon.");
    }
    
    static void studentPoint() 
    {
        String fullName; Double math; Double literature; Double english; Double scoreAverage;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your full name: ");
        fullName = sc.nextLine();
        System.out.print("Input your math score: ");
        math = sc.nextDouble();
        System.out.print("Input your literature score: ");
        literature = sc.nextDouble();
        System.out.print("Input your english score: ");
        english = sc.nextDouble();
        //======================================================
        scoreAverage = (math + literature + english) / 3;
        scoreAverage = (float)Math.round(scoreAverage*100)/100.00;
        //======================================================
        System.out.println("Your average score: " + scoreAverage);
    }
    
    static void product()
    {
        String fullName; int productPrice = 2035; int productNum; int promotionRequired = 5; Double discount = 0.02;
        Scanner sc = new Scanner(System.in);
        //==========================================================
        System.out.print("Input customer full name: ");
        fullName = sc.nextLine();
        System.out.print("Input number of products puchased: ");
        productNum = sc.nextInt();
        //===========================================================
        int promotionBy5Get1Quantity = productNum / promotionRequired;
        int discountProductQuantity = productNum % promotionRequired;
        Double priceToPay = (productNum * productPrice) - (discountProductQuantity*productPrice*discount);
        String priceToPayFormatted = NumberFormat.getCurrencyInstance().format(priceToPay);
        //===========================================================
        System.out.println("You have to pay " + priceToPayFormatted + " Thank you for stopping by.");
    }
    
    static void triangle()
    {
        float a; float b; float c;
        Scanner sc = new Scanner(System.in);
        //====================================
        System.out.print("Input A length: "); a = sc.nextFloat();
        System.out.print("Input B length: "); b = sc.nextFloat();
        System.out.print("Input C length: "); c = sc.nextFloat();
        //======================================
        if(a == b && b == c)
        {
            System.out.println("This is an equilateral triangle!");
        }
        else if (a == b && c*c == a*a + b*b)
        {
            System.out.println("This is an isosceles right triangle at C!");
        }
        else if(b == c && a*a == b*b + c*c)
        {
            System.out.println("This is an isosceles right triangle at A!");
        }
        else if (a == c && b*b == a*a + c*c)
        {
            System.out.println("This is an isosceles right triangle at B!");
        }
        else {
            if (a*a == b*b + c*c)
            {
                System.out.println("This is a right triangle at A!");
            }
            else if(b*b == a*a + c*c) 
            {
                System.out.println("This is a right triangle at B!");
            }
            else if(c*c == a*a + b*b)
            {
                System.out.println("This is a right triangle at C!");
            }
            else 
            {
                if (a == b && a == c)
                {
                    System.out.println("This is an isosceles triangle at A!");
                }
                else if(b == c && b == a)
                {
                    System.out.println("This is an isosceles triangle at B!");
                }
                else if(c == a && c == b)
                {
                    System.out.println("This is an isosceles triangle at C!");
                }
                else System.out.println("This is an ordinary triangle!");
            }
        }
    }
    
    static void day()
    {
        int day; int month; int year; int yearCaculated;
        int monthInYear = 12;
        Scanner sc = new Scanner (System.in);
        //====================================
        System.out.print("Input day: "); day = sc.nextInt();
        System.out.print("Input month: "); month = sc.nextInt();
        System.out.print("Input year: "); year = sc.nextInt();
        //====================================
        int monthCaculated;
        if (month > 3)
        {
            monthCaculated = month + monthInYear; yearCaculated = year - 1;
        }
        else 
        {
            monthCaculated = month; yearCaculated = year;
        }
        int dayCaculated = (day + 2*month + 3*(month + 1) /5 + year + year / 4) % 7;
        System.out.print("Day la ");
        switch (dayCaculated) {
            case 0:
                System.out.println("Chu nhat!");
                break;
            case 1:
                System.out.println("Thu 2!");
                break;
            case 2:
                System.out.println("Thu 3!");
                break;
            case 3:
                System.out.println("Thu 4!");
                break;
            case 4:
                System.out.println("Thu 5!");
                break;
            case 5:
                System.out.println("Thu 6!");
                break;
            case 6:
                System.out.println("Thu 7!");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    static void canChiYear()
    {
        int year;
        int year1900 = 1900;
        Scanner sc = new Scanner (System.in);
        //===================================
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
        //===================================
        int namCan = (year - year1900) % 10;
        int namChi = (year - year1900) % 12;
        switch (namCan) 
        {
            case 0:
                System.out.print("Canh ");
                break;
            case 1:
                System.out.print("Tan ");
                break;
            case 2:
                System.out.print("Nham ");
                break;
            case 3:
                System.out.print("Quy ");
                break;
            case 4:
                System.out.print("Giap ");
                break;
            case 5:
                System.out.print("At ");
                break;
            case 6:
                System.out.print("Binh ");
                break;
            case 7:
                System.out.print("Dinh ");
                break;
            case 8:
                System.out.print("Mau ");
                break;
            case 9:
                System.out.print("Ky ");
                break;
            default:
                throw new AssertionError();
        }
        switch (namChi) {
            case 0:
                System.out.println("Ty!");
                break;
            case 1:
                System.out.println("Suu!");
                break;
            case 2:
                System.out.println("Dan!");
                break;
            case 3:
                System.out.println("Meo!");
                break;
            case 4:
                System.out.println("Thin!");
                break;
            case 5:
                System.out.println("Tyj!");
                break;
            case 6:
                System.out.println("Ngo!");
                break;
            case 7:
                System.out.println("Mui!");
                break;
            case 8:
                System.out.println("Than!");
                break;
            case 9:
                System.out.println("Dau!");
                break;
            case 10:
                System.out.println("Tuat!");
                break;
            case 11:
                System.out.println("Hoi!");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    static void caculateN() 
    {
        int n;
        int loopInt = 1; float loopFloat = 1;
        Scanner sc = new Scanner(System.in);
        //==================================
        System.out.print("Input N: ");
        n = sc.nextInt();
        //=================================
        int S1 = 0; int S2 = 1; float S3 = 0; float S4 = 0;
        while(loopInt <= n)
        {
            S1 += loopInt++;
        } loopInt = 1;
        while(loopInt <= n)
        {
            S2 *= loopInt++;
        } loopInt = 1;
        while(loopFloat <= n)
        {
            S3 += 1/(loopFloat++);
        } S3 = (float)Math.round(S3*100)/100; loopFloat = 1;
        while(loopFloat <= n)
        {
            S4 += 1/(loopFloat * (++loopFloat));
        } S4 = (float)Math.round(S4*100)/100; loopFloat = 1;
        //========================================
        System.out.println("a. S1 = " + S1);
        System.out.println("b. S2 = " + S2);
        System.out.println("c. S3 = " + S3);
        System.out.println("d. S4 = " + S4);
    }
    
    static void minNum()
    {
        int n = 0; int sum = 0;
        while(true)
        {
            n++;
            sum += n;
            if(sum > 200) break;
        }
        System.out.println("So tu nhien nho nhat N = " + n);
        System.out.println("Tong so tu 1 den " + n + " la : " + sum);
    }
    
    public static void main(String[] args) { 
        //=============
        boolean quit = false;
        Scanner sc = new Scanner(System.in);  
        while(quit != true)
        {
            int choice;
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Welcome!");
            System.out.println("1. Input and Print their name and age.");
            System.out.println("2. Input and Print happy birthday text.");
            System.out.println("3. Input and Print student point.");
            System.out.println("4. Input and Print Customer product price.");
            System.out.println("5. Input and Print Triangle.");
            System.out.println("6. Input and print day of the week.");
            System.out.println("7. Input and print Can Chi year.");
            System.out.println("8. Input and print sums.");
            System.out.println("9. Find min number such that (1+2+...+N)>=200");
            System.out.println("0. Exit Program!");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Have a great day!"); quit = true;
                    break;
                case 1:
                    printTheirNameAndAge();
                    break;
                case 2:
                    printText();
                    break;
                case 3:
                    studentPoint();
                    break;
                case 4:
                    product();
                    break;
                case 5:
                    triangle();
                    break;
                case 6:
                    day();
                    break;
                case 7:
                    canChiYear();
                    break;
                case 8:
                    caculateN();
                    break;
                case 9:
                    minNum();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
