package com.example;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private List<Employee> employees = new ArrayList<Employee>();
    public Department(){



    }
    // One-to-many association with Employee
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees(){

        return this.employees;
    }
}
