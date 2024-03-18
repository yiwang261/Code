package com.wang.POJO;

import java.util.Date;

public class Student {
    private Long Id;
    private String name;
    private Integer age;
    private Double height;
    private Date birth;
    private Character sex;

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", birth=" + birth +
                ", sex=" + sex +
                '}';
    }

    public Student(Long id, String name, Integer age, Double height, Date birth, Character sex) {
        Id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.birth = birth;
        this.sex = sex;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}
