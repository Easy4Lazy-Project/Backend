package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Comment;
import com.easy4lazy.proj.service.CommentService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("api/v1/content/c")
@RestController
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping(path="/post/{id}/{token}")
    public String postComment(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @Valid @NotNull @RequestBody Comment comment){
        return commentService.postComment(userId, token, comment);
    }

    @GetMapping(path="/get/{uid}/{id}")
    public String getQuestionComments(@PathVariable("uid") int userId, @PathVariable("id") @Valid @NotNull int questionId){
        return commentService.getQuestionComments(userId, questionId);
    }

    @GetMapping(path="/get/{uid}/{id}")
    public String getAnswerComments(@PathVariable("uid") int userId, @PathVariable("id") @Valid @NotNull int answerId){
        return commentService.getAnswerComments(userId, answerId);
    }

    @DeleteMapping(path="/del/{uid}/{token}/{id}")
    public String deleteComment(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return commentService.deleteComment(userId, token, contentId);
    }

    @GetMapping(path="/count")
    public int getTotalCommentsCount(){
        return commentService.getTotalCommentsCount();
    }
}
