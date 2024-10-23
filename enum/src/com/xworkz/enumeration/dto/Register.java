package com.xworkz.enumeration.dto;

import com.xworkz.enumeration.internal.Gender;

public class Register {

    private String name;

    private int age;

    private Gender gender;

    private int limit;

    public Register(String name, int age, Gender gender, int limit) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Register{" +
                "name='" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", limit=" + limit +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
