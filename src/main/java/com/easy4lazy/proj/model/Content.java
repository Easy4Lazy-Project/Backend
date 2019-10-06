package com.easy4lazy.proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class Content {
    @NotBlank @NotNull
    int id;
    //this can be null if it is a question
    int content_id;
    @NotBlank @NotNull
    int contentType_id;
    @NotBlank @NotNull
    String body;
    @NotBlank @NotNull
    LocalDateTime creationDate;
    @NotBlank @NotNull
    int user_id;

    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }

    public int getContentType_id() {
        return contentType_id;
    }

    public void setContentType_id(int contentType_id) {
        this.contentType_id = contentType_id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(@JsonProperty("body") String body) {
        this.body = body;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(@JsonProperty int user_id) {
        this.user_id = user_id;
    }
}
