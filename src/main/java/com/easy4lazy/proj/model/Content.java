package com.easy4lazy.proj.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
public class Content {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.TABLE)
    Integer id;

    //this can be null if it is a question
    @Column(name = "content_id")
    Integer contentId; // for custom selection I need this type of naming convention (contentId) but for inserting I
                        // think this type of naming convention is use (content_id) that i mention it in @Column

    @NotBlank @NotNull
    @Column(name = "body")
    String body;

    @Column(name = "creation_date")
    Timestamp creationDate;

    @NotNull
    @Column(name = "user_id")
    Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
