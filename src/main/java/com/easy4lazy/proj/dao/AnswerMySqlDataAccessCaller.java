package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Answer;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;

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
        //validate token


        ///
        final String sql = "INSERT INTO content (user_id,body,content_id,creationDate,contenttype_id) VALUE(?,?,?,?,2)";
        return jdbcTemplate.execute(sql, (PreparedStatementCallback<String>) ps -> {
            ps.setInt(1,userId);
            ps.setString(2, ans);
            ps.setInt(3,questionId);
            ps.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
            if(ps.executeUpdate()>0){
                ResultSet keys = ps.getGeneratedKeys();
                int qid = 0;
                if(keys.next())
                    qid = keys.getInt(1);
                JsonObject jo = new JsonObject();
                jo.addProperty("message", "Answer Submission Successful");
                jo.addProperty("status", true);
                jo.addProperty("contentId",qid);
                return jo.toString();
            }
            return "";
        });

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
        final String sql = "SELECT COUNT(*) FROM content where contenttype_id=2";
        return jdbcTemplate.queryForObject(sql, null, Integer.class );
    }
}
