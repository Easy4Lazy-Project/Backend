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
@CrossOrigin
@Api(value = " : User Controller Resource")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = " : Sign Up Successful")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 500, message = "Error:")
            }
    )
    @PostMapping(path = "/create")
    public String signUp(@Valid @NonNull @RequestBody User user) {
        return userService.signUp(user);
    }

    @ApiOperation(value = " : login Successful")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 500, message = "Error:")
            }
    )
    @PostMapping(path = "/login/{email}/{password}")
    public String login(@PathVariable("email") @Valid @NonNull String email, @PathVariable("password") @Valid @NonNull String password) {
        return userService.login(email, password);
    }

    @ApiOperation(value = " : log out Successful")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful  logout"),
                    @ApiResponse(code = 500, message = "Error:")
            }
    )
    @GetMapping(path = "/logout/{uid}")
    public boolean signOut(@PathVariable("uid") @Valid @NonNull String userId) {
        return userService.signOut(userId);
    }

    @ApiOperation(value = " : Returns Total Users count")
    @ApiResponses(
            value = {
                    @ApiResponse(code = 100, message = "100 is the message"),
                    @ApiResponse(code = 200, message = "Successful count Users"),
                    @ApiResponse(code = 500, message = "Error:")

            }
    )
    @GetMapping(path = "/count")
    public int getTotalUsersCount() {
        return userService.getTotalUsersCount();
    }

}
