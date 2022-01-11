package com.company.englobe;

public class Worker extends Employee {

    int workerID;

    Worker(String name, int age, int employeeID, String team, int workerID) {
        super(name, age, employeeID, team);
        this.workerID = workerID;
    }

    String drill(String location) {
        return this.name + " drill " + location;
    }

}
