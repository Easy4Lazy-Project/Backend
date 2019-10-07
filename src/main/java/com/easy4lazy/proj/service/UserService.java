package com.easy4lazy.proj.service;


import com.easy4lazy.proj.dao.UserDao;
import com.easy4lazy.proj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("userMysql") UserDao userDao) {
        this.userDao = userDao;
    }

    public String signUp(User user){
        return userDao.signUp(user);
    }

    public String login(String email, String pwd){
        return userDao.login(email,pwd);
    }

   // public  boolean isUserLoggedIn(String token, String userId){
  //      return userDao.isUserLoggedIn(token, userId);
  //  }

    public boolean signOut(String userId){
        return userDao.signOut(userId);
    }

    public int getTotalUsersCount(){
        return userDao.getTotalUsersCount();
    }
}
