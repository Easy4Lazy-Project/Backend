package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Purpose: class that interact with the mysql database
 * THIS IS WHERE YOUR ASSIGNMENT IS. DO NOT THE CODE STRUCTURE. JUST IMPLEMENTS THE METHODS
 */

@Repository("questionMysql")
public class QuestionMySqlDataAccessCaller implements QuestionDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public QuestionMySqlDataAccessCaller(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //TODO: implements this
    @Override
    public String postQuestion(int userId, String token, String question, String subject, String tags) {
        return null;
    }

    //TODO implements this
    @Override
    public String getQuestion(int questionId) {
         //return the question,
        //              comments,
                    //answers
                        //comments
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
    public String editQuestion(int userId, String token, String question, String subject, String tags) {
        return null;
    }


    @Override
    public int getTotalQuestionsCount() {
        return 0;
    }
}
