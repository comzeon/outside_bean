package com.ssm.spring_mybatis.UserService.Impl;

import com.ssm.spring_mybatis.UserDao.UserDao;
import com.ssm.spring_mybatis.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void print() {
        System.out.println("Request accepted! --from userService");
        System.out.println("Call UserDao!");
        this.userDao.print();
    }
}
