package com.easy4lazy.proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
public class Answer extends Content {

    public Answer(){}

    public Answer(@Valid @JsonProperty("content_id") Integer content_id,
                  @Valid @JsonProperty("body") String body,
                  @Valid @JsonProperty("user_id") Integer user_id ) {
        this.contentId = content_id;
        this.body = body;
        this.userId = user_id;
    }

    @Column(name = "content_type_id")
   final Integer contentTypeId = 2;


   @Column(name = "comment_count")
   Integer commentCount;

    public Integer getContentTypeId() {
        return contentTypeId;
    }

    public Integer getCommentCount() {
        return commentCount;
    }
}
