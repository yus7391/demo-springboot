package com.example.demospringboot.entity;

public class User {
    private String name;
    private String gengder;
    private Integer age;

    public User(String name, String gengder, Integer age) {
        this.name = name;
        this.gengder = gengder;
        this.age = age;
    }
    public User () {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGengder() {
        return gengder;
    }

    public void setGengder(String gengder) {
        this.gengder = gengder;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
