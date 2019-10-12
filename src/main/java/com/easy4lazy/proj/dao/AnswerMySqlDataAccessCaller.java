package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Answer;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

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
         //TODO to be implemented

        ///
        final String sql = "INSERT INTO content (user_id,body,content_id,creationDate,contenttype_id, answerCount) VALUES (?,?,?,?,2,0)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,userId);
                ps.setString(2, ans);
                ps.setInt(3,questionId);
                ps.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
                return ps;
            }
        }, keyHolder);
        long id = keyHolder.getKey().longValue();
        JsonObject jo = new JsonObject();
        if(id > 0L){
            jo.addProperty("message", "Answer Submission Successful");
            jo.addProperty("status", true);
            jo.addProperty("contentId",id);
            return jo.toString();
        }
        else {
              return Utils.returnErrorJsonResponse("Answer Submission Failed!!!") ;
        }

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
        final String sql =
                "SELECT * FROM content WHERE contenttype_id=1 " +
                //"AND content_id = 23 " +
                "ORDER BY creationDate DESC";
        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
        //return result.toString();
        return new Gson().toJson(result);//convert the list to json
    }

    // TODO: implement this
    @Override
    public int getTotalAnswersCount() {
        final String sql = "SELECT COUNT(*) FROM content where contenttype_id=2";
        return jdbcTemplate.queryForObject(sql, null, Integer.class );
    }

    @Override
    public String getAnswersPerMonth(int year) {
        return null;
    }
}
