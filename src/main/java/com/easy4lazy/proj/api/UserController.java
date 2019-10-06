package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.User;
import com.easy4lazy.proj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("api/v1/user")
@RestController
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path="/create")
    public String signUp(@Valid @NonNull @RequestBody User user) {
        return userService.signUp(user);
    }

    @PostMapping(path="/login/{email}/{pwd}")
    public String login(@PathVariable("email") @Valid @NonNull  String email, @PathVariable("pwd") @Valid @NonNull String pwd) {
        return  userService.login(email,pwd);
    }

    @GetMapping(path="/logout/{uid}")
    public boolean signOut(@PathVariable("uid") @Valid @NonNull String userId) {
        return userService.signOut(userId);
    }

    @GetMapping(path = "/count")
    public int getTotalUsersCount(){
        return userService.getTotalUsersCount();
    }

}
