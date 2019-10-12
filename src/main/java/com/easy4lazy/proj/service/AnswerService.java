package com.easy4lazy.proj.service;

import com.easy4lazy.proj.dao.AnswerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    private final AnswerDao answerDao;

    @Autowired
    public AnswerService(@Qualifier("answerMysql") AnswerDao answerDao) {
        this.answerDao = answerDao;
    }

    public String postAnswer(int userId, String token, int qid, String ans){
        return answerDao.postAnswer(userId, token, qid, ans);
    }

    public String editAnswer(int userId, String token, int qid, String ans){
        return answerDao.editAnswer(userId, token, qid, ans);
    }

    public String deleteAnswer(int userId, String token, int contentId){
        return answerDao.deleteAnswer(userId, token, contentId);
    }

    public String getQuestionAnswers(int userId, int questionId){
        return answerDao.getQuestionAnswers(userId, questionId);
    }

    public int getTotalAnswersCount(){
        return answerDao.getTotalAnswersCount();
    }

    public String getAnswersPerMonth(int year){
        return answerDao.getAnswersPerMonth(year);
    }


}
