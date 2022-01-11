package com.company.englobe;

public class People {
    String name;
    int age;
    private String magic;

    People(String name, int age) {
        this.name = name;
        this.age = age;
        this.magic = "lalala";
    }

    String eat(String food) {
        return this.name + " eat " + food;
    }

    void fart() {
        System.out.println(this.name + " fart ");
    }
}


