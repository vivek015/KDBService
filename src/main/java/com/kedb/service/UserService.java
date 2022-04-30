package com.kedb.service;

import com.kedb.dto.LoginDto;
import com.kedb.dto.SignUpDto;
import com.kedb.response.ApiResponse;

public interface UserService {

    ApiResponse login(LoginDto loginDto);

    ApiResponse signUp(SignUpDto signUpDto);
}
