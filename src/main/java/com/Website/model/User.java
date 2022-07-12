package com.Website.model;



public class User {
    private int id;
    private String statusAccount;
    private String login;
    private String password;
    private String name;
    private String surName;
    private int age;

    public User(String login, String password, String name, String surName, int age) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setStatusAccount(String statusAccount) {
        this.statusAccount = statusAccount;
    }

    public String getStatusAccount() {
        return statusAccount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
