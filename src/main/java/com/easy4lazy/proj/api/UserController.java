package com.easy4lazy.proj.api;

import com.easy4lazy.proj.model.User;
import com.easy4lazy.proj.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("api/v1/user")
@RestController
@Api(value = " : User Controller Resource" )
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = " : sign Up Successful")
    @PostMapping(path="/create")
    public String signUp(@Valid @NonNull @RequestBody User user) {
        return userService.signUp(user);
    }

    @ApiOperation(value = " : login Successful")
    @PostMapping(path="/login/{email}/{password}")
    public String login(@PathVariable("email") @Valid @NonNull  String email, @PathVariable("password") @Valid @NonNull String password) {
        return  userService.login(email,password);
    }
    @ApiOperation(value = " : log out Successful")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful  logout")
            }
    )
    @GetMapping(path="/logout/{uid}")
    public boolean signOut(@PathVariable("uid") @Valid @NonNull String userId) {
        return userService.signOut(userId);
    }
    @ApiOperation(value = " : Returns Total Users count")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful count Users")
            }
    )
    @GetMapping(path = "/count")
    public int getTotalUsersCount(){
        return userService.getTotalUsersCount();
    }

}
