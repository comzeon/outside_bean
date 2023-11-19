package com.ssm.spring_mybatis.UserController.Impl;

import com.ssm.spring_mybatis.UserController.UserController;
import com.ssm.spring_mybatis.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserControllerImpl implements UserController {
    @Autowired
    private UserService userService;
    public void print(){
        System.out.println("Call UserService!");
        this.userService.print();
    }
}
