package com.easy4lazy.proj.dao;

import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Purpose: class that interact with the mysql database
 * THIS IS WHERE YOUR ASSIGNMENT IS. DO NOT THE CODE STRUCTURE. JUST IMPLEMENTS THE METHODS
 * CHECK THE VoteDao interface for more info
 */
@Repository("voteMysql")
public class VoteMySqlDataAccessCaller implements VoteDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public VoteMySqlDataAccessCaller(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int vote(int contentId, int userId, int type, String tokens){
        //check token
        final String sql = "REPLACE INTO vote (user_id,content_id,createdDate,votetype_id) VALUES (?,?,?,?)";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            public PreparedStatement createPreparedStatement(Connection connection)
                    throws SQLException {
                PreparedStatement ps =  connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1,userId);
                ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
                ps.setInt(2,contentId);
                ps.setInt(4, type);
                return ps;
            }
        }, keyHolder);
        long id = keyHolder.getKey().longValue();
        JsonObject jo = new JsonObject();
        if(id > 0L){
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public int getTotalQuestionVoteUp() {
        return 0;
    }

    @Override
    public int getTotalQuestionVoteDown() {
        return 0;
    }

    @Override
    public int getTotalAnswerVoteUp() {
        return 0;
    }

    @Override
    public int getTotalAnswerVoteDown() {
        final String sql = "SELECT COUNT(*) FROM vote WHERE votetype_id=2 and content_id IN (SELECT content_id FROM content WHERE contenttype_id=2)";
        return jdbcTemplate.queryForObject(sql, null, Integer.class );
        //return 0;
    }
}
