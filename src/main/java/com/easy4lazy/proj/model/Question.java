package com.easy4lazy.proj.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Question extends Content {

    @NotNull @NotBlank
    String subject;
    @NotNull  @NotBlank
    String tags;
    int commentCount;



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
