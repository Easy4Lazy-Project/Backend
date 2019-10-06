package com.easy4lazy.proj.model;

public class Answer extends Content {

   final int contentType_id = 2;
   int commentCount;

    @Override
    public int getContentType_id() {
        return contentType_id;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }
}
