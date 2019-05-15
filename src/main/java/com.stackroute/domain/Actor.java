package com.stackroute.domain;

public class Actor{

    private String name;
    private String gender;
    private int age;



    //constructor
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}
