package com.itcast.demo;

import com.itcast.service.UserService;
import com.itcast.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {
        //spring容器中的service在容器中已注入dao
        ApplicationContext app =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
        //new 出来的service没有注入dao,空指针异常
//        UserService userService1=new UserServiceImpl();
//        userService1.save();
    }

}
