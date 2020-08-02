package com.itcast.dao.impl;

import com.itcast.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public UserDaoImpl() {
//        System.out.println("UserDaoImpl被创建");
//    }
//    public void init(){
//        System.out.println("init方法被执行了");
//    } public void destroy(){
//        System.out.println("destroy方法被执行了");
//    }


    public void save() {
        System.out.println(name+":"+age);
        System.out.println("save running");
    }
}
