package com.easy4lazy.proj.api;

import com.easy4lazy.proj.service.VoteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("api/v1/content/v")
@RestController
@CrossOrigin
@Api(value = " : Vote Controller Resource" )
public class VoteController {
    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }
    @ApiOperation(value = " : Returns vote on a content")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful  vote Question Up")
            }
    )
    @PostMapping(path="/vote/{uid}/{token}/{id}/{type}")
    public int voteQuestionUp(@PathVariable("uid") @Valid @NotNull int userId,
                              @PathVariable("token") @Valid @NotNull String token,
                              @PathVariable("type") @Valid @NotNull int type,
                              @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.vote(contentId, userId, type, token);
    }

    @GetMapping(path="/tqvu")
    public int getTotalQuestionVoteUp(){
        return voteService.getTotalQuestionVoteUp();
    }
    @ApiOperation(value = " : Returns Total Question Vote Down")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Total Question Vote Down")
            }
    )
    @GetMapping(path="/tqvd")
    public int getTotalQuestionVoteDown(){
        return voteService.getTotalQuestionVoteDown();
    }
    @ApiOperation(value = " : Returns Total Answer Vote Up")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Total Answer Vote Up")
            }
    )
    @GetMapping(path="/tavp")
    public int getTotalAnswerVoteUp(){
        return voteService.getTotalAnswerVoteUp();
    }
    @ApiOperation(value = " : Returns Total Question Vote Answer")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Total Answer Vote Down")
            }
    )
    @GetMapping(path="/tavd")
    public int getTotalAnswerVoteDown(){
        return voteService.getTotalAnswerVoteDown();
    }
}
