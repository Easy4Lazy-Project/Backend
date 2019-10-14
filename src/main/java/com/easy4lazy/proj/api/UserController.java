package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.User;
import com.easy4lazy.proj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("easy4lazy/user")
@RestController
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/signup")
    public User signUp(@RequestBody @Valid User user){
        return userService.signUp(user);
    }

    @PostMapping(path = "/login")
    public User login(@RequestBody User user){
        return userService.login(user);
    }
}
