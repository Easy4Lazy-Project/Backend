package com.easy4lazy.proj.service;

import com.easy4lazy.proj.dao.QuestionDao;
import com.easy4lazy.proj.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    private final QuestionDao questionDao;

    @Autowired
    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public String postQuestion(int userId, String token, Question question){
        return questionDao.postQuestion(userId, token, question);
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

    public String editQuestion(int userId, String token, Question question){
        return questionDao.editQuestion(userId, token, question);
    }

    public int getTotalAnswersCount(){
        return questionDao.getTotalQuestionsCount();
    }
}
