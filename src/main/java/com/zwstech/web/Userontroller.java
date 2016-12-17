package com.zwstech.web;

import com.zwstech.domain.User;
import com.zwstech.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wutairui on 2016/12/6.
 */
@ComponentScan
@RestController
@RequestMapping("/user")
public class Userontroller {

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(){
        return userService.getUser();
    }
}
