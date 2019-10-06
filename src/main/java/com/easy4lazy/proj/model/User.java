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
     * @param id
     * @param token
     */
    public User(@JsonProperty("userId") int id, @JsonProperty("token") String token) {
        this.id = id;
        this.token = token;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getToken() {
        return token;
    }
}
