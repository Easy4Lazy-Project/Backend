package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Comment;
import com.easy4lazy.proj.service.CommentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("api/v1/content/c")
@RestController
@CrossOrigin
@Api(value = " : Comment Controller Resource" )
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @ApiOperation(value = " : post Comment Success")
    @PostMapping(path="{uid}/{token}/{contentId}/{comment}")
    public String postComment(@PathVariable("uid") @Valid @NotNull int userId,
                              @PathVariable("token") @Valid @NotNull String token,
                              @PathVariable("contentId") @Valid @NotNull int contentId,
                              @Valid @NotNull @PathVariable String comment){
        return commentService.postComment(userId, token, contentId, comment);
    }

    /**** features disabled for v0.1.0   *****
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

     *****/

    @ApiOperation(value = " : Returns Comments count")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful count Comments")
            }
    )
    @GetMapping(path="/count")
    public int getTotalCommentsCount(){
        return commentService.getTotalCommentsCount();
    }
}
