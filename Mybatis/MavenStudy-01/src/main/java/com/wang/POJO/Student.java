package com.wang.POJO;

public class Student {
    private int Id;



    private String Name;
    private int Age;
    private String PhoneNumber;
    private String Fromm;

    public Student(){}

    public Student(String name, int age, String phoneNumber, String fromm,int id) {
        Name = name;
        Age = age;
        PhoneNumber = phoneNumber;
        Fromm = fromm;

        Id=id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", From='" + Fromm + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getFrom() {
        return Fromm;
    }

    public void setFrom(String from) {
        Fromm = from;
    }


}
