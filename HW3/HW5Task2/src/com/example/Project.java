package com.example;

import java.util.ArrayList;
import java.util.List;

public class Project {

    // Aggregation with Student: A project has members(students)
    private List<Student> members= new ArrayList<Student>();
    private String name;

    public Project(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(Student student){
        members.add(student);
    }

    public List<Student> getMembers(){
        return members;
    }
}
