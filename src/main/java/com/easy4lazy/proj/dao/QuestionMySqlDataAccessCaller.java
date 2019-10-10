package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Question;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

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
        //check if token is valid

        final String sql = "INSERT INTO content (user_id,body,subject,tags,creationDate, contenttype_id) VALUE(?,?,?,?,?,1)";
        return jdbcTemplate.execute(sql, (PreparedStatementCallback<String>) ps -> {
            ps.setInt(1,userId);
            ps.setString(2, question);
            ps.setString(3,subject);
            ps.setString(4,tags);
            ps.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
            if(ps.executeUpdate()>0){
                ResultSet keys = ps.getGeneratedKeys();
                int qid = 0;
                if(keys.next())
                    qid = keys.getInt(1);
                JsonObject jo = new JsonObject();
                jo.addProperty("message", "Question Submission Successful");
                jo.addProperty("status", true);
                jo.addProperty("contentId",qid);
                return jo.toString();
            }
            return "";
        });

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
        final String sql = "SELECT COUNT(*) FROM content where contenttype_id=1";
        return jdbcTemplate.queryForObject(sql, null, Integer.class );
    }
}
