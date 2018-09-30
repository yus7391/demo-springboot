package com.example.demospringboot.controller;

import com.example.demospringboot.entity.TbUser;
import com.example.demospringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "tbuser/")
public class TbUserController {
    @Autowired
    private HttpServletRequest request;

    @Resource
    private UserService userService;

    @RequestMapping("getUser")
    public TbUser selectUser(@RequestParam(value = "id",defaultValue = "9") long id){
        TbUser user = userService.selectUserById(id);
        System.out.println("User: " + user);
        System.out.println("request: " + request);
        return user;
    }
}
