package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.Comment;
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
        final String sql = "INSERT INTO content (user_id,body,content_id,creationDate,contenttype_id) VALUE(?,?,?,?,3)";
        return jdbcTemplate.execute(sql, (PreparedStatementCallback<String>) ps -> {
            ps.setInt(1,userId);
            ps.setString(2, comment);
            ps.setInt(3,contentId);
            ps.setTimestamp(4, Timestamp.valueOf(LocalDateTime.now()));
            if(ps.executeUpdate()>0){
                ResultSet keys = ps.getGeneratedKeys();
                int qid = 0;
                if(keys.next())
                    qid = keys.getInt(1);
                JsonObject jo = new JsonObject();
                jo.addProperty("message", "Comment Submission Successful");
                jo.addProperty("status", true);
                jo.addProperty("contentId",qid);
                return jo.toString();
            }
            return "";
        });
    }

    @Override
    public String getQuestionComments(int userId, int questionId) {
        return null;
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
