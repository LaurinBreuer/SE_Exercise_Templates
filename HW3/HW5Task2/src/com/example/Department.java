package com.example;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name;
    private String headOfDept;
    private List<Employee> employees = new ArrayList<Employee>();

    public Department(String head_of_dept){
        this.headOfDept = head_of_dept;
    }
    // One-to-many association with Employee
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees(){

        return this.employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
