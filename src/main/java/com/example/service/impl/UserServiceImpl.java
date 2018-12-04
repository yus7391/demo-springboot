package com.example.service.impl;

import com.example.entity.User;
import com.example.event.EventPulish;
import com.example.event.save.SaveEvent;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private EventPulish eventPulish;

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int deleteUserById(int id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insertUser(User user) {
        int insert = userMapper.insert(user);
        SaveEvent saveEvent = new SaveEvent(user, 12L);
        eventPulish.publish(saveEvent);
        return insert;
    }
}
