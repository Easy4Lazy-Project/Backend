package com.easy4lazy.proj.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
public class Vote {
    @Id
    @NotNull
    @GeneratedValue()
    private Integer id;

    @NotNull
    @Column(name = "vote_type_id")
    private Integer voteTypeId;

    @Column(name = "created_date")
    private Timestamp createdDate;

    @NotNull
    @Column(name = "user_id")
    private Integer userId;

    @NotNull
    @Column(name = "content_id")
    private Integer contentId;

    public Vote() {
    }

    public Vote(@Valid @JsonProperty("vote_type_id") Integer vote_type_id,
                @Valid @JsonProperty("user_id") Integer user_id,
                @Valid @JsonProperty("content_id") Integer content_id) {
        this.voteTypeId = vote_type_id;
        this.userId = user_id;
        this.contentId = content_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVoteTypeId() {
        return voteTypeId;
    }

    public void setVoteTypeId(Integer voteTypeId) {
        this.voteTypeId = voteTypeId;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }


}
