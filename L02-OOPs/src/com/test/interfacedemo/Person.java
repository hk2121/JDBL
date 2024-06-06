package com.test.interfacedemo;

public class Person {
    private String name;
    protected Integer age =0;

    public Person(String name) {
        this.name = name;
    }

    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public void walk() {
        System.out.println(name + " is walking");


    }
}
