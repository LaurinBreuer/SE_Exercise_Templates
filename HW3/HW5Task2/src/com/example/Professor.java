package com.example;

import java.util.ArrayList;
import java.util.List;

//Sub class of Employee
public class Professor extends Employee{
    private String name;
    private int employeeId;

    //1..* multiplicity as the many side with Course
    private List<Course> courses= new ArrayList<Course>();

    public Professor(String name){
        super(name);

    }
    public void publicCourse(){
        for (int i=0; i<courses.size(); i++){
            System.out.println(courses.get(i).getName());
        }

    }
    public void assignTA(TA ta, Course course){
        course.setTa(ta);
    }

    public void addCourse(Course course){
        courses.add(course);
    }




}
