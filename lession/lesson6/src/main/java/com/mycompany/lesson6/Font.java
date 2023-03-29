/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson6;

/**
 *
 * @author phong
 */
public class Font {
    //fields
    private int fontSize;
    private String fontName;
    //constructor
    public Font() {
        
    }
    // getters, setters
    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }
    //methods
    public void output() {
        System.out.println(this.fontName + " " + this.fontSize);
    }
}
