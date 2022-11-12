package com.example;

import java.util.ArrayList;
import java.util.List;

public class Exam {

    private int maxValue;
    private List<Student> students = new ArrayList<Student>();

    public Exam(){

    }

    public boolean register(Student pStudent){
        for(Student s : students){
            if (students.contains(s)){
                return true;
            }
        }
        return false;
    }


    public void addStudent(Student pStudent){
        this.students.add(pStudent);
    }

    public List<Student> getStudents(){
        return this.students;
    }

}
