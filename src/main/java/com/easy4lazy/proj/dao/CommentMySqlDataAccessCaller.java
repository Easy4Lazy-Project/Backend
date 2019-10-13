package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Comment;
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
 * CHECK THE CommentDao interface for more info
 */
@Repository("commentMysql")
public class CommentMySqlDataAccessCaller implements CommentDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public CommentMySqlDataAccessCaller(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //TODO implement this
    @Override
    public String postComment(int userId, String token, int contentId, String comment) {
        //validate token
        
        ///
        final String sql = "INSERT INTO content (user_id,body,content_id,creationDate,contenttype_id, answerCount) VALUES (?,?,?,?,3,0)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                PreparedStatement ps =  connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,userId);
                ps.setString(2, comment);
                ps.setInt(3,contentId);
                ps.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
                return ps;
            }
        }, keyHolder);
        long id = keyHolder.getKey().longValue();
        JsonObject jo = new JsonObject();
        if(id > 0L){
            jo.addProperty("message", "Comment Submission Successful");
            jo.addProperty("status", true);
            jo.addProperty("contentId",id);
            return jo.toString();
        }
        else {
            return Utils.returnErrorJsonResponse("Comment Submission Failed!!!") ;
        }
        
    }

    @Override
    public String getQuestionComments(int userId, int questionId) {
        final String sql =
        "SELECT c.id, c.content_id, u.name, c.body, c.creationDate " +
                "FROM content c " +
                "LEFT JOIN user u ON u.id = c.user_id " +
                "WHERE c.contentType_id = 3 " +
                "AND c.user_id = ? " +
                "AND c.content_id = ? " +
                "ORDER BY c.creationDate DESC";

        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql,
                new Object[]{userId,questionId});

        //return result.toString();
        return new Gson().toJson(result);//convert the list to json

    }

    @Override
    public String getAnswerComments(int userId, int answerId) {
        return null;
    }

    @Override
    public String deleteComment(int userId, String token, int contentId) {
        return null;
    }

    @Override
    public int getTotalCommentsCount() {
        final String sql = "SELECT COUNT(*) FROM content where contenttype_id=3";
        return jdbcTemplate.queryForObject(sql, null, Integer.class );
    }
}
