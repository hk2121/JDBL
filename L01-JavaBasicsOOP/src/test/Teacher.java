package test;

public class Teacher extends Person {
    private String subject;

//    public Teacher(String subject) {
//        this.subject = subject;
//    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void walk(){
        System.out.println("Teacher is walking");
    }
}
