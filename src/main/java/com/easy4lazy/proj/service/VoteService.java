package com.easy4lazy.proj.service;

import com.easy4lazy.proj.dao.VoteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
    private final VoteDao voteDao;

    @Autowired
    public VoteService(@Qualifier("voteMysql") VoteDao voteDao) {
        this.voteDao = voteDao;
    }

    public int vote(int contentId, int userId, int type, String tokens){
        return voteDao.vote(contentId, userId, type, tokens);
    }



    public int getTotalQuestionVoteUp(){
        return voteDao.getTotalQuestionVoteUp();
    }

    public int getTotalQuestionVoteDown(){
        return voteDao.getTotalQuestionVoteDown();
    }

    public int getTotalAnswerVoteUp(){
        return voteDao.getTotalAnswerVoteUp();
    }

    public int getTotalAnswerVoteDown(){
        return voteDao.getTotalAnswerVoteDown();
    }


}
