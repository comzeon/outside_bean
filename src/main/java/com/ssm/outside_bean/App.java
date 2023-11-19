package com.ssm.spring_mybatis;

import com.ssm.spring_mybatis.UserController.UserController;
import com.ssm.spring_mybatis.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = (UserController) annotationConfigApplicationContext.getBean(UserController.class);
        userController.print();
    }
}
