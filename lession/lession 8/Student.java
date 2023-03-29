/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections_;

/**
 *
 * @author admin
 */
public class Student implements Comparable<Student>{
    private int id;
    private String lastName;
    private String firstName;

    public Student(int id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    @Override
    public String toString(){
        return  String.format("%-10s|%-20s|%-10s", id, lastName, firstName);
    }
    
    public void output(){
        System.out.println(toString());
    }

//    @Override
//    public int compareTo(Student stud) {
////        if (id>stud.id){
////            return id-stud.id; 1 // sost tang dan
////        }else if (id == stud.id){
////            return id-stud.id 0;
////        }else{
////            return id-stud.id -1;
////        }
////        return id-stud.id; //tang dan
//        return -(id-stud.id); //giam dan
        
//    }
    @Override
    public int compareTo(Student stud) {
        if (firstName.compareTo(stud.firstName)>0){
            return 1; // sost tang dan
        }else if (firstName.compareTo(stud.firstName)==0){
//            return -id+stud.id; //tăng dần
            return -lastName.compareTo(stud.lastName);
        }else{
            return -1;
        }
    }

   
}
