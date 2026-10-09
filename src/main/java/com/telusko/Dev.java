package com.telusko;

public class Dev {

//    private Laptop laptop;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Dev() {
        System.out.println("dev constructor");
    }


    public void build() {

        System.out.println("working on a project");
//        laptop.compile();
    }
}
