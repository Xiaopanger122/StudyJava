package com.company.englobe;

public class Employee extends People {
    int employeeID;
    String team;

    Employee(String name, int age, int employeeID, String team) {
        super(name, age);
        this.employeeID = employeeID;
        this.team = team;
    }

    String work(String project) {
        return this.name + this.employeeID + project;
    }
}
