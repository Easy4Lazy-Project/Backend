package com.easy4lazy.proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Question extends Content {

    @NotNull @NotBlank
    @Column(name = "subject")
    String subject;

    @NotNull  @NotBlank
    @Column(name = "tags")
    String tags;

    @NotNull
    @Column(name = "content_type_id")
    final Integer contentTypeId = 1;

    @Column(name = "comment_count")
    Integer commentCount;


    public Question(){

    }

    public Question(@Valid @JsonProperty("subject") String subject,
                    @Valid @JsonProperty("tags") String tags,
                    @Valid @JsonProperty("body") String body) {
        this.subject = subject;
        this.tags = tags;
        this.body = body;
    }

    public Integer getContentTypeId() {
        return contentTypeId;
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

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }
}
