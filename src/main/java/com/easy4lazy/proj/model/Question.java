package com.easy4lazy.proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Question extends Content {


    String subject;
    String body;
    String tags;
    int commentCount;

    public Question(@JsonProperty("subject") String subject, @JsonProperty("tags") String tags, @JsonProperty("body") String body) {
        this.subject = subject;
        this.tags = tags;
        this.body = body;
    }

    final int contentType_id = 1;

    @Override
    public int getContentType_id() {
        return contentType_id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
