package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.User;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

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
        final String sql = "INSERT INTO user (name, email, password) VALUES(?,?,md5(?))";
       // int resp = jdbcTemplate.update(sql, new Object[]{user.getName(), user.getEmail(), user.getPassword() });
        return jdbcTemplate.execute(sql, new PreparedStatementCallback<String>() {
            @Override
            public String doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setString(1,user.getName());
                ps.setString(2, user.getEmail());
                ps.setString(3, user.getPassword());
               if(ps.execute()){
                   JsonObject jo = new JsonObject();
                   jo.addProperty("message", "User Creation Successfully");
                   jo.addProperty("status", true);
                   return jo.toString();
                }
                return "";
            }
        });
        
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
        final String sql = "SELECT id, md5(password) as token FROM user where email=? and password=md5(?)";
        Map<String, Object> resMap = jdbcTemplate.queryForMap(sql, new Object[]{email,pwd});

        if(resMap != null){
            JsonObject jo = new JsonObject();
            jo.addProperty("message", "Login Successful");
            jo.addProperty("status", true);
            int uid = (int) resMap.get("id");
            String token = (String) resMap.get("token");
            jo.addProperty("userId", uid);
            jo.addProperty("token", token);

            updateToken(uid, token);

            return jo.toString();
        }
        return null;
    }

    private void updateToken(int userId, String token){
        final String sql = "UPDATE user SET token=? where id=?";
        boolean resp = jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {
            @Override
            public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
                ps.setString(1,token);
                ps.setInt(2,userId);

                return ps.execute();
            }
        });
    }

    /**
     *
     * @param token
     * @param userId
     * @return true if only token is not null or empty in db
     */
    @Override
    public boolean isUserLoggedIn(String token, String userId) {
        final String sql = "SELECT * FROM user where token=? and id=?";
        Map<String, Object> resMap = jdbcTemplate.queryForMap(sql, new Object[]{token,Integer.parseInt(userId)});
        return resMap.size()>0? true:false;
    }

    /**
     *
     * @param userId
     * @return true after resetting the token field to null in db
     */
    @Override
    public boolean signOut(String userId) {
        int res = jdbcTemplate.update("UPDATE user SET token=\"\" WHERE id=? ", new Object[]{Integer.parseInt(userId)});
        return res>0? true:false;
    }

    @Override
    public int getTotalUsersCount() {
        final String sql = "SELECT COUNT(*) FROM user";
        return jdbcTemplate.queryForObject(sql, null, Integer.class );
    }
}
