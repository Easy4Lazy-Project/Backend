package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.Vote;
import com.easy4lazy.proj.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("easy4lazy/vote")
@RestController
public class VoteController {

    final private VoteService voteService;

    @Autowired
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping(path = "/votequestionup")
    public Vote voteQuestionUp(@RequestBody Vote vote){
        return voteService.vote(vote);
    }

    @PostMapping(path = "/votequestiondown")
    public Vote voteQuestionDown(@RequestBody Vote vote){
        return voteService.vote(vote);
    }

    @PostMapping(path = "/voteanswerup")
    public Vote voteAnswerUp(@RequestBody Vote vote){
        return voteService.vote(vote);
    }

    @PostMapping(path = "/voteanswerdown")
    public Vote voteAnswerDown(@RequestBody Vote vote){
        return voteService.vote(vote);
    }

    @GetMapping(path = "/totalquestionvoteup")
    public Integer getTotalQuestionVoteUp(@RequestBody Vote vote){
        return voteService.totalVote(vote);
    }

    @GetMapping(path = "/totalquestionvotedown")
    public Integer getTotalQuestionVoteDown(@RequestBody Vote vote){
        return voteService.totalVote(vote);
    }

    @GetMapping(path = "/totalanswervoteup")
    public Integer getTotalAnswerVoteUp(@RequestBody Vote vote){
        return voteService.totalVote(vote);
    }

    @GetMapping(path = "/totalanswervotedown")
    public Integer getTotalAnswerVoteDown(@RequestBody Vote vote){
        return voteService.totalVote(vote);
    }
}
