package com.easy4lazy.proj.service;

import com.easy4lazy.proj.repository.VoteRepository;
import com.easy4lazy.proj.model.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    @Autowired
    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote vote(Vote vote){
        return voteRepository.save(vote);
    }

    public Integer totalVote(Vote vote){
        return voteRepository.countAllByVoteTypeIdAndContentId(vote.getVoteTypeId(), vote.getContentId());
    }
}
