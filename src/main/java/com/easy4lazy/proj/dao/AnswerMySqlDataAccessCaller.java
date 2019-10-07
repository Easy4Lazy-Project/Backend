package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Purpose: class that interact with the mysql database
 * THIS IS WHERE YOUR ASSIGNMENT IS. DO NOT THE CODE STRUCTURE. JUST IMPLEMENTS THE METHODS
 */
@Repository("answerMysql")
public class AnswerMySqlDataAccessCaller implements AnswerDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AnswerMySqlDataAccessCaller(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //TODO:  implement this
    @Override
    public String postAnswer(int userId, String token, int questionId, String ans) {
        return null;
    }

    //TODO: implement
    @Override
    public String editAnswer(int userId, String token, int questionId, String ans) {
        return null;
    }

    @Override
    public String deleteAnswer(int userId, String token, int contentId) {
        return null;
    }

    @Override
    public String getQuestionAnswers(int userId, int questionId) {
        return null;
    }

    // TODO: implement this
    @Override
    public int getTotalAnswersCount() {
        return 0;
    }
}
