package com.Website.model;

public class BuilderUser {
    private final User user;
    public BuilderUser(){
        user = new User();
    }
    public BuilderUser name(String name){
        this.user.setName(name);
        return this;
    }
    public BuilderUser surName(String surName){
        this.user.setSurName(surName);
        return this;
    }
    public BuilderUser login(String login){
        this.user.setLogin(login);
        return this;
    }
    public BuilderUser password(String password){
        this.user.setPassword(password);
        return this;
    }
    public BuilderUser age(int age){
        this.user.setAge(age);
        return this;
    }
    public BuilderUser statusAccount(String status){
        this.user.setStatusAccount(status);
        return this;
    }
    public User build(){
        return this.user;
    }
}
