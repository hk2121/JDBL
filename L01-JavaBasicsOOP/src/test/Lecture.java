package test;

import java.util.Date;

public class Lecture {

    protected static Integer numberOfObjects = 0;

    static {
        System.out.println("Executing static Block:");
    }

    private String name;
    private Date createdDate;
    private String status;
    private String mentor;

    public Lecture(String name, Date createdDate, String status, String mentor) {
        this.name = name;
        this.createdDate = createdDate;
        this.status = status;
        this.mentor = mentor;
    }

    public Lecture() {
        numberOfObjects++;
    }

    public static Integer getNumberOfObjects() {
        return numberOfObjects;
    }

    public static void setNumberOfObjects(Integer numberOfObjects) {
        Lecture.numberOfObjects = numberOfObjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
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


}
