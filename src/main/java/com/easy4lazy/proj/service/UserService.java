package com.easy4lazy.proj.service;


import com.easy4lazy.proj.repository.UserRepository;
import com.easy4lazy.proj.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public UserService(UserRepository user){
        this.userRepository = user;
    }

    public User signUp(User user){
        return userRepository.save(user);
    }

    public User login(User user){
        return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }
}
