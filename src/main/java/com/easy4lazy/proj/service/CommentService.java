package com.easy4lazy.proj.service;

import com.easy4lazy.proj.repository.CommentRepository;
import com.easy4lazy.proj.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository cr) {
        this.commentRepository = cr;
    }

    public Comment postComment(Comment c){
        return commentRepository.save(c);
    }

    public List<Comment> getCommentsOfQuestionOrAnswer(Comment c){
        return commentRepository.findByContentTypeIdAndContentId(3,c.getContentId());
    }

    public void deleteComment(Comment c){
        commentRepository.deleteById(c.getId());
    }

    public Integer getTotalCountOfComments(Comment c){
        return commentRepository.countAllByContentId(c.getContentId());
    }
}
