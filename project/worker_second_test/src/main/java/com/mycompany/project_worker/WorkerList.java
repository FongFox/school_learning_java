/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project_worker;

import java.util.ArrayList;

/**
 *
 * @author phong
 */
public class WorkerList {
   private ArrayList<Worker> list;

    public WorkerList() {
        list = new ArrayList<Worker>();
    }

    public WorkerList(ArrayList<Worker> list) {
        this.list = list;
    }
   
    public void add(Worker item) {
        list.add(item);
    }
    
    public void output() {
        for (Worker stud : list) {
            stud.output();
        }
    }
}
