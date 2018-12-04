package com.example.service;

import com.example.entity.User;

public interface UserService {
    User selectUserById(int id);

    int deleteUserById(int id);

    int insertUser(User user);
}
