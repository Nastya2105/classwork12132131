package com.company;

public class Main {

    public static void main(String[] args) {
        gh tom = new gh();
        System.out.println(tom.sex);
        System.out.println(tom.age);
        System.out.println(tom.name);
        tom.age = 50;
        tom.info();

        gh N = new gh("N");
        N.info();

    }

}
