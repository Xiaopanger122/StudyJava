package com.company.englobe;

import java.util.HashSet;

public class Manager extends Employee {
    int managerID;
    HashSet<String> staff;

    Manager(String name, int age, int employeeID, String team, int managerID) {
        super(name, age, employeeID, team);
        this.managerID = managerID;
        this.staff = new HashSet<>();
    }

    String fire(Worker worker) {
        if (staff.contains(worker.name)) {
            staff.remove(worker.name);
            return this.name + " fire " + worker.name;
        } else
            return this.name + " cannot fire " + worker.name;
    }

    String hire(Worker worker) {
        if (!staff.contains(worker.name)) {
            staff.add(worker.name);
            return this.name + " hire " + worker.name;
        } else
            return this.name + " cannot hire " + worker.name;
    }

}
