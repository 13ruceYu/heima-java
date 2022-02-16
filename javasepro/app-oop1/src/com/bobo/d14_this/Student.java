package com.bobo.d14_this;

public class Student {
    private String name;
    private String school;

    public Student() {
    }

    public Student(String name) {
        this(name, "NB");
    }

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
