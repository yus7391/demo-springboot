package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user/save")
    public List<User> saveUsersInfo(String userName) {
        System.out.println("userName: " + userName);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(null,"zz123","male",21,"描述"));
        users.add(new User(null,"zz456","male",21,"描述"));
        /*users.forEach(user -> {
            userService.insertUser(user);
        });*/

        users.forEach(userService::insertUser);
        return users;
    }

    @RequestMapping("/user/{userId}")
    public User getUserInfo(@PathVariable int userId) {
        User user = userService.selectUserById(userId);
        return user;
    }

}
