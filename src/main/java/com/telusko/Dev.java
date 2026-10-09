package com.telusko;

public class Dev {

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    //reference variable, class reference
    private Laptop laptop;

    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dev() {
        System.out.println("dev constructor");
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev 1 Constructor");
    }



    public void build() {

        System.out.println("working on a project");
        laptop.compile();
    }
}
