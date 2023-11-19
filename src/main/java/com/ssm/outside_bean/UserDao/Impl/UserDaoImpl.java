package com.ssm.spring_mybatis.UserDao.Impl;

import com.ssm.spring_mybatis.UserDao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private DataSource dataSource;
    @Override
    public void print() {
        System.out.println("Request accepted! -from userDao");
        System.out.println(dataSource);
    }
}
