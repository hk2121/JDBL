package com.test.interfacedemo;

public class Teacher extends Person {
    private String subject;
    private  int age = 25;

    public Teacher(String name) {
        super(name);
    }

//    public Teacher(String subject) {
//        this.subject = subject;
//    }

    public Teacher() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void walk() {
        System.out.println("Teacher with age " + age + " and person age "+super.age+" is walking");
    }
}
