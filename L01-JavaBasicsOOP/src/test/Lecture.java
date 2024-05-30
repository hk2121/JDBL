package test;

import java.util.Date;

public class Lecture {

    public static Integer numberOfObjects = 0;

    static {
        System.out.println("Executing static Block:");
    }

    public String name;
    public Date createdDate;
    public String status;
    public String mentor;

    public Lecture(String name, Date createdDate, String status, String mentor) {
        this.name = name;
        this.createdDate = createdDate;
        this.status = status;
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", createdDate=" + createdDate +
                ", status='" + status + '\'' +
                ", mentor='" + mentor + '\'' +
                '}';
    }

    public Lecture() {
        numberOfObjects++;
    }

}
