package com.telusko;

public class Dev {

//    private Laptop laptop;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev() {
        System.out.println("dev constructor");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev 1 Constructor");
    }

    private int age;



    public void build() {

        System.out.println("working on a project");
//        laptop.compile();
    }
}
