package com.example;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;
    private Professor prof;
    private List<Student> students = new ArrayList<Student>();
    private List<TA> tas = new ArrayList<TA>();

    public Course(int id, String name, int maxCapacity, Professor prof) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.prof = prof;
    }

    public void enroll(Student student){
        if (!isFull) {
            students.add(student);
        }else{
            System.out.println("The course is full.");
        }
    }

    public void setMaxCap(int max){
        maxCapacity = max;
    }

    public Professor getProf(){
        return prof;
    }

    public void setTa(TA ta){
        tas.add(ta);
    }

    public String getName(){
        return this.name;
    }

    public void setFull(){
        isFull = true;
    }




}
