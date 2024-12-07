package com.klef.jfsd.exam;

import java.util.List;

public class employee {
    private int employeeId;
    private String name;
    private double salary;
    private String department;
    private List<String> skills;

    // Constructor for dependency injection
    public void Employee(int employeeId, String name, double salary, String department, List<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + 
               ", department=" + department + ", skills=" + skills + "]";
    }
}
