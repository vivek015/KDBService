package com.kedb.controller;

import com.kedb.dto.LoginDto;
import com.kedb.dto.SignUpDto;
import com.kedb.response.ApiResponse;
import com.kedb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rainbow")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ApiResponse signUp(@RequestBody SignUpDto signUpDto){
        return userService.signUp(signUpDto);
    }

    @PostMapping("/login")
    public ApiResponse login(@RequestBody LoginDto loginDto){
        return userService.login(loginDto);
    }
}
