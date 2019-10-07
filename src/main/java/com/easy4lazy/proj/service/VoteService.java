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

    public int voteQuestionUp(int contentId, int userId, String tokens){
        return voteDao.voteQuestionUp(contentId, userId, tokens);
    }

    public int voteQuestionDown(int contentId, int userId, String tokens){
        return voteDao.voteQuestionDown(contentId, userId, tokens);
    }

    public int voteAnswerUp(int contentId, int userId, String tokens){
        return voteDao.voteAnswerUp(contentId, userId, tokens);
    }

    public int voteAnswerDown(int contentId, int userId, String tokens){
        return voteDao.voteAnswerDown(contentId, userId, tokens);
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
