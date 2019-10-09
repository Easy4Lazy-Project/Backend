package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Purpose: class that interact with the mysql database
 * THIS IS WHERE YOUR ASSIGNMENT IS. DO NOT THE CODE STRUCTURE. JUST IMPLEMENTS THE METHODS
 */
@Repository("userMysql")
public class UserMySqlDataAccessCaller implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserMySqlDataAccessCaller(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
//    @Override
//    public String signUp(String name, String email, String pwd) {
//        return null;
//    }

    /**
     *
     * @param user (email, name, pwd)
     * @return ATTENTION: check the UserDao interface for expected output
     */
    @Override
    public String signUp(User user) {
        //TODO : implements

        return null;
    }

    /**
     *
     * @param email
     * @param pwd
     * @return ATTENTION: check the UserDao interface for expected output
     */
    @Override
    public String login(String email, String pwd) {
        //TODO implements
        return null;
    }

    /**
     *
     * @param token
     * @param userId
     * @return true if only token is not null or empty in db
     */
    @Override
    public boolean isUserLoggedIn(String token, String userId) {
        //TODO implements
        return false;
    }

    /**
     *
     * @param userId
     * @return true after resetting the token field to null in db
     */
    @Override
    public boolean signOut(String userId) {
        //TODO implements
        return false;
    }

    @Override
    public int getTotalUsersCount() {
        //todo implements
        return 0;
    }
}
