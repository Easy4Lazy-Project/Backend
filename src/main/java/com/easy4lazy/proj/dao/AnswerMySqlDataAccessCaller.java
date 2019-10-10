package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Answer;
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

//        return jdbcTemplate.execute(sql, (PreparedStatementCallback<String>) ps -> {
//            ps.setInt(1,userId);
//            ps.setString(2, ans);
//            ps.setInt(3,questionId);
//            ps.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
//            JsonObject jo = new JsonObject();
//            if(ps.executeUpdate()>0){
//                ResultSet keys = ps.getGeneratedKeys();
//                int qid = 0;
//                if(keys.next())
//                    qid = keys.getInt(1);
//
//                jo.addProperty("message", "Answer Submission Successful");
//                jo.addProperty("status", true);
//                jo.addProperty("contentId",qid);
//                return jo.toString();
//            }
//            jo.addProperty("message", "Answer Submission Failed!!!");
//            jo.addProperty("status", true);
//            return "";
//        });

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
