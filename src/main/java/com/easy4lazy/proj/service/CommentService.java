package com.easy4lazy.proj.service;

import com.easy4lazy.proj.dao.CommentDao;
import com.easy4lazy.proj.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    private final CommentDao commentDao;

    @Autowired
    public CommentService(@Qualifier("commentMysql") CommentDao contentDao) {
        this.commentDao = contentDao;
    }

    public String postComment(int userId, String token, int contentId, String comment){
        return commentDao.postComment(userId, token, contentId, comment);
    }


    public String getQuestionComments(int userId, int questionId){
        return commentDao.getQuestionComments(userId,questionId);
    }

    public String getAnswerComments(int userId, int answerId){
        return commentDao.getAnswerComments(userId, answerId);
    }

    public String deleteComment(int userId, String token, int contentId){
        return commentDao.deleteComment(userId, token, contentId);
    }

    public int getTotalCommentsCount(){
        return commentDao.getTotalCommentsCount();
    }

}
