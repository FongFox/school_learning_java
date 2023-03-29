/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefile;

/**
 *
 * @author admin
 */
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%d, %s\n", id, name);
    }
    
    public void output(){
        System.out.format("%-10d%-20s\n", id, name);
    }
            
    
}
