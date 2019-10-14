package com.easy4lazy.proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String about_me;
    int age;
    LocalDateTime creation_date;
    @NotBlank
    String name;
    String location;
    @NotBlank
    @NotNull
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

//    /**
//     * Suitable for isUserLoggedin method call
//     * @param id
//     * @param token
//     */
//    public User(@JsonProperty("userId") int id, @JsonProperty("token") String token) {
//        this.id = id;
//        this.token = token;
//    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getCreation_date() {
        return creation_date;
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

    public String getPassword(){
        return password;
    }
}
