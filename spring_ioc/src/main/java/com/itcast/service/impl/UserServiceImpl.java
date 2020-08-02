package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
//通过set方法把dao注入serviceImpl
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        //从容器中取出dao
//        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}
