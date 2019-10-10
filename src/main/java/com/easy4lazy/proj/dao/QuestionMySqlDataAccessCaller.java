package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Question;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

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


        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                String sql = "INSERT INTO content (user_id,body, subject, tags, creationDate, contenttype_id, answerCount) VALUES (?,?,?,?,?,1,0)";
                PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,userId);
                ps.setString(2, question);
                ps.setString(3,subject);
                ps.setString(4,tags);
                ps.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
               return ps;

            }
        }, keyHolder);
        long id = keyHolder.getKey().longValue();
        JsonObject jo = new JsonObject();
        if(id > 0L){
            jo.addProperty("message", "Question Submission Successful");
            jo.addProperty("status", true);
            jo.addProperty("contentId",id);
            return jo.toString();
        }
        else {

            return Utils.returnErrorJsonResponse("Question Submission Failed!!!");
        }
        // suitable for insertion without geting the auto-generated key
//        return jdbcTemplate.execute(sql, (PreparedStatementCallback<String>) ps -> {
//            ps.setInt(1,userId);
//            ps.setString(2, question);
//            ps.setString(3,subject);
//            ps.setString(4,tags);
//            ps.setTimestamp(5, Timestamp.valueOf(LocalDateTime.now()));
//            JsonObject jo = new JsonObject();
//           // if(ps.execute(sql, Statement.RETURN_GENERATED_KEYS)){
//            if(ps.executeUpdate()>0){
//                ResultSet keys = ps.getGeneratedKeys();
//                int qid = 0;
//                if(keys.next())
//                    qid = keys.getInt(1);
//
//                jo.addProperty("message", "Question Submission Successful");
//                jo.addProperty("status", true);
//                jo.addProperty("contentId",qid);
//                return jo.toString();
//            }
//            jo.addProperty("message", "Question Submission Failed!!!");
//            jo.addProperty("status", false);
//            return jo.toString();
//        });

    }

    //TODO implements this
    @Override
    public String getQuestion(int questionId) {
        //TODO very important
         //return the question,
        //              comments,
                    //answers
                        //comments
        return null;
    }

    @Override
    public String getAllQuestions() {
        final String sql = "SELECT * FROM content WHERE contenttype_id=1 ORDER BY creationDate DESC";
        List result = jdbcTemplate.queryForList(sql);
        return result.toString();
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
