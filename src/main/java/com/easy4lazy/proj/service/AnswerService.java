package com.easy4lazy.proj.service;

import com.easy4lazy.proj.dao.AnswerDao;
import com.easy4lazy.proj.dao.ContentDao;
import com.easy4lazy.proj.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
    private final AnswerDao answerDao;

    @Autowired
    public AnswerService(AnswerDao answerDao) {
        this.answerDao = answerDao;
    }

    public String postAnswer(int userId, String token, Answer ans){
        return answerDao.postAnswer(userId, token, ans);
    }

    public String editAnswer(int userId, String token, Answer answer){
        return answerDao.editAnswer(userId, token, answer);
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


}
