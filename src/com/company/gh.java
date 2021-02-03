package com.company;

public class gh {
    String sex;
    int age;
    String name;

    gh(String name) {
        this.name = name;
    }
    gh(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(sex);
    }
}
