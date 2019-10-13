package com.easy4lazy.proj.api;


import com.easy4lazy.proj.model.User;
import com.easy4lazy.proj.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserControllerTest {

    @InjectMocks
    UserController userController;

    UserService userService = mock(UserService.class);

    @Mock
    User user;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLogin() throws Exception {
        String Email = "1@mum.edu";
        String password = "12345";

        when(userService.login(Email, password)).thenReturn("True");

        String ret = userService.login(Email, password);
        Assert.assertEquals(ret, "True");

    }

    @Test
    public void testSignUp() {

        String expected = "True";
        when(userService.signUp(user)).thenReturn(expected);
        assertEquals("test Sign UP", userService.signUp(user), expected);
    }

    @Test
    public void testsignOut(){
        String uid="1";
        when(userService.signOut(uid)).thenReturn(true);

        assertTrue(userService.signOut(uid));
    }
}
