package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Comment;
import org.springframework.stereotype.Repository;

/**
 * Purpose: class that interact with the mysql database
 * THIS IS WHERE YOUR ASSIGNMENT IS. DO NOT THE CODE STRUCTURE. JUST IMPLEMENTS THE METHODS
 * CHECK THE CommentDao interface for more info
 */
@Repository("mysql")
public class CommentMySqlDataAccessCaller implements CommentDao {
    
    @Override
    public String postComment(int userId, String token, Comment comment) {
        return null;
    }

    @Override
    public String getQuestionComments(int userId, int questionId) {
        return null;
    }

    @Override
    public String getAnswerComments(int userId, int answerId) {
        return null;
    }

    @Override
    public String deleteComment(int userId, String token, int contentId) {
        return null;
    }

    @Override
    public int getTotalCommentsCount() {
        return 0;
    }
}
