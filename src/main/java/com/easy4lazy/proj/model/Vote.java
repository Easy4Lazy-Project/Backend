package com.easy4lazy.proj.model;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

public class Vote {
    private int id;
    @NotBlank
    private int voteType_id;

    private LocalDateTime createdDate;
    @NotBlank
    private int user_id;
    @NotBlank
    private int content_id;

    public Vote(@NotBlank int voteType_id, @NotBlank int user_id, @NotBlank int content_id) {
        this.voteType_id = voteType_id;
        this.user_id = user_id;
        this.content_id = content_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVoteType_id() {
        return voteType_id;
    }

    public void setVoteType_id(int voteType_id) {
        this.voteType_id = voteType_id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getContent_id() {
        return content_id;
    }

    public void setContent_id(int content_id) {
        this.content_id = content_id;
    }


}
