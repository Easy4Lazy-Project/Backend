package com.easy4lazy.proj.api;

import com.easy4lazy.proj.service.VoteService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RequestMapping("api/v1/content/v")
@RestController
public class VoteController {
    private final VoteService voteService;

    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @GetMapping(path="/vqu/{uid}/{token}/{id}")
    public int voteQuestionUp(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.voteQuestionUp(contentId, userId, token);
    }

    @GetMapping(path="/vqd/{uid}/{token}/{id}")
    public int voteQuestionDown(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String tokens, @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.voteQuestionDown(contentId, userId, tokens);
    }

    @GetMapping(path="/vau/{uid}/{token}/{id}")
    public int voteAnswerUp(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.voteAnswerUp(contentId, userId, token);
    }

    @GetMapping(path="/vad/{uid}/{token}/{id}")
    public int voteAnswerDown(@PathVariable("uid") @Valid @NotNull int userId, @PathVariable("token") @Valid @NotNull String token, @PathVariable("id") @Valid @NotNull int contentId){
        return voteService.voteAnswerDown(contentId, userId, token);
    }

    @GetMapping(path="/tqvu")
    public int getTotalQuestionVoteUp(){
        return voteService.getTotalQuestionVoteUp();
    }

    @GetMapping(path="/tqvd")
    public int getTotalQuestionVoteDown(){
        return voteService.getTotalQuestionVoteDown();
    }

    @GetMapping(path="/tavp")
    public int getTotalAnswerVoteUp(){
        return voteService.getTotalAnswerVoteUp();
    }

    @GetMapping(path="/tavd")
    public int getTotalAnswerVoteDown(){
        return voteService.getTotalAnswerVoteDown();
    }
}
