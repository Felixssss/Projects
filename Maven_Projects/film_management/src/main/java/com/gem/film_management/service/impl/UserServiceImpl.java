package com.gem.film_management.service.impl;

import com.gem.film_management.mapper.UserMapper;
import com.gem.film_management.pojo.User;
import com.gem.film_management.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(String name, String pwd, String type) {

        return userMapper.getUser(name,pwd,type);
    }

    @Override
    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    @Override
    public int checkUserName(String name) {
        return userMapper.checkUserName(name);
    }
}
