package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Question;
import org.springframework.stereotype.Repository;

/**
 * Purpose: class that interact with the mysql database
 * THIS IS WHERE YOUR ASSIGNMENT IS. DO NOT THE CODE STRUCTURE. JUST IMPLEMENTS THE METHODS
 */

@Repository("mysql")
public class QuestionMySqlDataAccessCaller implements QuestionDao {
    @Override
    public String postQuestion(int userId, String token, Question question) {
        return null;
    }

    @Override
    public String getQuestion(int questionId) {
        return null;
    }

    @Override
    public String getAllQuestions() {
        return null;
    }

    @Override
    public String deleteQuestion(int userId, String token, int contentId) {
        return null;
    }

    @Override
    public String editQuestion(int userId, String token, Question question) {
        return null;
    }

    @Override
    public int getTotalQuestionsCount() {
        return 0;
    }
}
