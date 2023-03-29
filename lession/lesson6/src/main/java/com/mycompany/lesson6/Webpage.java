/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lesson6;

/**
 *
 * @author phong
 */
public class Webpage {
    //fileds
    private String title;
    private String language;
    private Font fontWebPage = new Font();
    //constructor
    public Webpage() {
        
    }
    //getters, setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    //methods
    void output () {
        fontWebPage.setFontName("Arial"); fontWebPage.setFontSize(12);
        this.title = "abcxyz"; this.language = "eng"; 
        System.out.println(this.title + " " + this.language + " " + fontWebPage.getFontName() + " " + fontWebPage.getFontSize());
    }
    
}
