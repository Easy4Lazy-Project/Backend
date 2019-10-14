package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Comment;
import com.easy4lazy.proj.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequestMapping("easy4lazy/comments")
@RestController
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping(path = "/postcomment")
    public Comment postComment(@RequestBody Comment comment){
        return commentService.postComment(comment);
    }

    @GetMapping(path = "/getcommentsofquestion")
    public List<Comment> getCommentsOfQuestion(@RequestBody Comment comment){
        return commentService.getCommentsOfQuestionOrAnswer(comment);
    }

    @GetMapping(path = "/getcommentsofanswer")
    public List<Comment> getCommentsOfAnswer(@RequestBody Comment comment){
        return commentService.getCommentsOfQuestionOrAnswer(comment);
    }

    @DeleteMapping(path = "/deletecomment")
    public void deleteComment(@RequestBody Comment comment){
        commentService.deleteComment(comment);
    }

    @GetMapping(path = "/totalnumberofcomments")
    public Integer getTotalNumberOfComments(@RequestBody Comment comment){
        return commentService.getTotalCountOfComments(comment);
    }
}
