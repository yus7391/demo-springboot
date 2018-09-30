package com.example.demospringboot.service;

import com.example.demospringboot.entity.TbUser;

public interface UserService {
    TbUser selectUserById(long id);

    int deleteUserById(long id);

    int insertUser(TbUser user);
}
