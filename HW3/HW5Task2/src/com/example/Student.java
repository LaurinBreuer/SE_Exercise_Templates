package com.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private Project project;
    private List<Exam> exams = new ArrayList<Exam>();

    public Student(int pId, String pName){
        this.id = pId;
        this.name = pName;
    }

    public String getName() {
        return this.name;

    }

    public Project getProject(){
        return this.project;
    }

    public void addExam(Exam pExam){
        this.exams.add(pExam);
    }

    public List<Exam> getExams(){
        return this.exams;
    }

}
