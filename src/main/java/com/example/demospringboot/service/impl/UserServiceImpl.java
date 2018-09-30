package com.example.demospringboot.service.impl;

import com.example.demospringboot.dao.TbUserMapper;
import com.example.demospringboot.entity.TbUser;
import com.example.demospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private TbUserMapper userMapper;

    @Override
    public TbUser selectUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteUserById(long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertUser(TbUser user) {
        return userMapper.insertUser(user);
    }
}
