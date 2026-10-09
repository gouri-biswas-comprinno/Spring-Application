package com.telusko;

public class Dev {

//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    //reference variable, class reference
//    private Laptop laptop;

    //reference variable, class reference
    private Computer comp;
    private int age;

    public Dev() {
        System.out.println("dev constructor");
    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//        System.out.println("Dev 1 Constructor");
//    }



    public void build() {

        System.out.println("working on a project");
        comp.compile();
    }
}
