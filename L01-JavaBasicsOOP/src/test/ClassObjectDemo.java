package test;

import java.util.Date;

public class ClassObjectDemo {
    public static void main(String[] args) {
        method1();
        System.out.println("Done");
    }

    public static void method1() {
        Lecture l1 = new Lecture();
//        l1.createdDate = new Date();
//        l1.mentor = "Himanshu";
//        l1.setMentor("Himanshu"); // is used to access the getter & setter - for not directly used the variable
//        l1.status = "Live classes";
//        l1.name = "Java Basics";
//        l1.numberOfObjects = 1;
        System.out.println(l1);

        Lecture l2 = new Lecture();
//        l2.createdDate = new Date();
//        l2.mentor = "Himanshu";
//        l2.status = "upcoming";
//        l2.name = "Java OOPs";
        System.out.println(l2);

        Lecture l3 = new Lecture("Exception handling", new Date(), "Upcoming", "Shashikant");
        System.out.println(l3);
        System.out.println("Number Of Objects : " + l3.numberOfObjects);
    }
}
