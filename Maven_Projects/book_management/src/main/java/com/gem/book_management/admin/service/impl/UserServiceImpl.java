package com.gem.book_management.admin.service.impl;

import com.gem.book_management.admin.mapper.UserMapper;
import com.gem.book_management.admin.pojo.User;
import com.gem.book_management.admin.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(String username, String pwd) {
        return userMapper.getUser(username,pwd);
    }
}
