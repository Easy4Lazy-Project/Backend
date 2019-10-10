package com.easy4lazy.proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class User {
    int id; //userId
    String aboutMe;
    int age;
    LocalDateTime createdDate;
    String name;
    String location;
    String email;
    String password;
    String token;

    /**
     *  Suitable for User Account Creation. Take note of the JSON Property name
     * @param name
     * @param email
     * @param password
     */
    public User(@JsonProperty("name") String name, @JsonProperty("email") String email, @JsonProperty("pwd") String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Suitable for isUserLoggedin method call
     * @param //id
     * @param //token
     */
//    public User(@JsonProperty("userId") int id, @JsonProperty("token") String token) {
//        this.id = id;
//        this.token = token;
//    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
