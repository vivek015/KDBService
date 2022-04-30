package com.kedb.service;

import com.kedb.dao.UserDao;
import com.kedb.dao.UserDaoImpl;
import com.kedb.dto.LoginDto;
import com.kedb.dto.SignUpDto;
import com.kedb.entity.User;
import com.kedb.response.ApiResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserDaoImpl userDaoImpl;

    @Transactional
    public ApiResponse signUp(SignUpDto signUpDto) {
        validateSignUp(signUpDto);
        User user = new User();
        //can use Bcrypt
        BeanUtils.copyProperties(signUpDto, user);
        userDaoImpl.save(user);
        return new ApiResponse(200, "success", user);
    }

    @Transactional
    public ApiResponse login(LoginDto loginDto) {
        User user = userDao.findByUsername(loginDto.getUsername());
        if(user == null) {
            throw new RuntimeException("User does not exist.");
        }
        if(!user.getPassword().equals(loginDto.getPassword())){
            throw new RuntimeException("Password mismatch.");
        }
        return new ApiResponse(200, "Login success", null) ;

    }

    private void validateSignUp(SignUpDto signUpDto) {
    }


}
