package test;

import java.util.Date;

public class InheritanceDemo {
    public static void main(String[] args) {
        Lecture l3 = new Lecture("Exception handling", new Date(), "Upcoming", "Shashikant");
        System.out.println(l3.toString());


        Teacher t1 = new Teacher();
        t1.setName("Ravi");
        t1.setSubject("Maths");
        t1.walk();

        Person p1 = new Teacher();
        p1.setName("Ravi");
//        p1.setSubject("Maths");
        p1.walk();
    }
}
