package com.easy4lazy.proj.dao;

import com.easy4lazy.proj.model.User;

public interface UserDao {

    /**
     *
     * @param //name
     * @param //email
     * @param// pwd
     * @return {token , message }
     */
    //String signUp(String name, String email, String pwd);

    /**
     *
     * @param user
     * @return {token , message } a json object
     */
    String signUp(User user);

    /**
     *  login the user into the system
     * @param email
     * @param pwd
     * @return json object { token, userId, message}
     * token is null if the login fails
     */
    String login(String email, String pwd);

    /**
     *  check if the user token is still valid in the system
     * @param token
     * @param userId
     * @return true if token still exist in database
     */
    boolean isUserLoggedIn(String token, String userId);

    /**
     * sign the user out
     * @param userId
     * @return
     */
    boolean signOut(String userId);

    /**
     *
     * @return  the total numbers of users
     * we need it for the dashboard
     */
    int getTotalUsersCount();
}
