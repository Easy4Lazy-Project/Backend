package com.easy4lazy.proj.service;

import com.easy4lazy.proj.dao.QuestionDao;
import com.easy4lazy.proj.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    private final QuestionDao questionDao;

    @Autowired
    public QuestionService(@Qualifier("questionMysql") QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public String postQuestion(int userId, String token, String question, String subject, String tags){
        return questionDao.postQuestion(userId, token, question, subject, tags);
    }

    public String getQuestion(int questionId){
        return questionDao.getQuestion(questionId);
    }

    public String getAllQuestions(){
        return questionDao.getAllQuestions();
    }

    public String deleteQuestion(int userId, String token, int contentId){
        return questionDao.deleteQuestion(userId, token, contentId);
    }

    public String editQuestion(int userId, String token, String question, String subject, String tags){
        return questionDao.postQuestion(userId, token, question, subject, tags);
    }

    public int getTotalAnswersCount(){
        return questionDao.getTotalQuestionsCount();
    }

    public String getQuestionsPerMonth(int year){
        return questionDao.getQuestionsPerMonth(year);
    }

    public String getTopTenVotedQuestions(){
        return questionDao.getTopTenVotedQuestions();
    }
}
