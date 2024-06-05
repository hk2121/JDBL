package test;

import java.util.Date;
import java.util.List;

public class InheritanceDemo {
    public static void main(String[] args) {
        Lecture l3 = new Lecture("Exception handling", new Date(), "Upcoming", "Shashikant");
        System.out.println(l3.toString());


        Teacher t1 = new Teacher();
        t1.setName("Ravi");
        t1.setSubject("Maths");
        t1.walk();

//      SubClass to superClass
        Person p1 = new Teacher();
        p1.setName("Ravi");
//        p1.setSubject("Maths");
        p1.walk();

        //    SuperClass to SubClass
        if (p1 instanceof Teacher) {
            Teacher teacher = (Teacher) p1;
            teacher.setName("Ravi");
            teacher.setSubject("Maths");
            teacher.setAge(21);
            teacher.walk();
        }

        Person p2 = new Person();
        p2.setName("Ravi");
        p2.age = 21;
        p2.walk();

   /*     //    SuperClass to SubClass -- not possible
        Teacher teacher = (Teacher) new Person();
        teacher.setName("Ravi");
        teacher.setSubject("Maths");
        teacher.setAge(21);
        teacher.walk();
    */
    }

    public String processAllPerson(Person person) {
        //
        //
        return "Done";
    }

    public String processAllPerson(List<Person> list) {
        //
        //
        for (Person p : list) {
            p.walk();
        }
        return "Done";
    }
}
