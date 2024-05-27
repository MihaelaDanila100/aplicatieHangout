package com.example.project;
public class User {
    private String name;
    private int age;
    private String location;
    private String gender;
    private String hobbies;
    private String job;

    public User(String name, int age, String location, String gender, String hobbies, String job) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.gender = gender;
        this.hobbies = hobbies;
        this.job = job;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getLocation() { return location; }
    public String getGender() { return gender; }
    public String getHobbies() { return hobbies; }
    public String getJob() { return job; }
}