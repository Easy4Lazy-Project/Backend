package com.easy4lazy.proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
public class Comment extends Content {

    public Comment(@Valid @JsonProperty("content_id") Integer content_id,
                   @Valid @JsonProperty("body") String body,
                   @Valid @JsonProperty("user_id") Integer userId) {
        this.contentId = content_id;
        this.body = body;
        this.userId = userId;
    }

    public Comment() {
    }

    // we can use this @Transient annotation to tell the hibernate ignore this variable as a database column
    @Column(name = "content_type_id")
    final int contentTypeId = 3;

    public Integer getContentTypeId() {
        return contentTypeId;
    }
}
