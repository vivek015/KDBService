package com.kedb.dao;

import com.kedb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface UserDao extends JpaRepository<User, Serializable> {
    User findByUsername(String username);

    User findByEmail(String email);
}
