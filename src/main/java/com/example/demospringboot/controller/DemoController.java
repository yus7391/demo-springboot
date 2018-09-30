package com.example.demospringboot.controller;

import com.example.demospringboot.entity.TbUser;
import com.example.demospringboot.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    @RequestMapping("/users/{userName}")
    public List<User> getUsersInfo(@PathVariable(value = "userName") String userName) {
        System.out.println("userName: " + userName);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("zz","male",21));
        users.add(new User("dd","male",24));
        users.add(new User("ff","female",29));
        users.add(new User("kk","male",27));
        return users;
    }
    @RequestMapping("/user/*")
    public User getUserInfo(@RequestParam(value = "name",defaultValue = "myname") String userName) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("zz","male",21));
        users.add(new User("name","male",24));
        users.add(new User("ff","female",29));
        users.add(new User("myname","male",27));
        for (User user : users) {
            if(user.getName().equalsIgnoreCase(userName)) {
                return user;
            }
        }
        return null;
    }

}
