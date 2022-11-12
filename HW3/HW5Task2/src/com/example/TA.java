package com.example;

import java.util.ArrayList;
import java.util.List;

public class TA {
    private String name;
    private List<Course> courses= new ArrayList<Course>();
    public TA(){

    }

    public Course getCourse(int i){
        return courses.get(i);
    }

    public String getName(){
        return name;
    }

    public void setName(String pName){
        this.name = pName;
    }
}
