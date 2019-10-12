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
    @ApiOperation(value = " : Returns vote Question Up")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful  vote Question Up")
            }
    )
    @GetMapping(path="/vqu/{uid}/{token}/{id}")
    public int voteQuestionUp(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.voteQuestionUp(contentId, userId, token);
    }
    @ApiOperation(value = " : Returns vote Question Down")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful  vote Question Down")
            }
    )
    @GetMapping(path="/vqd/{uid}/{token}/{id}")
    public int voteQuestionDown(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String tokens, @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.voteQuestionDown(contentId, userId, tokens);
    }
    @ApiOperation(value = " : Returns vote Answer Up")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful  vote Answer Up")
            }
    )
    @GetMapping(path="/vau/{uid}/{token}/{id}")
    public int voteAnswerUp(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.voteAnswerUp(contentId, userId, token);
    }
    @ApiOperation(value = " : Returns Total Question Vote Up")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Total Question Vote Up")
            }
    )
    @GetMapping(path="/vad/{uid}/{token}/{id}")
    public int voteAnswerDown(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.voteAnswerDown(contentId, userId, token);
    }
    @ApiOperation(value = " : Returns Total Question Vote Up")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful Total Question Vote Up")
            }
    )
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
