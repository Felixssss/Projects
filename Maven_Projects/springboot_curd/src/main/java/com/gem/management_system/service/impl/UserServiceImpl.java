package com.gem.management_system.service.impl;

import javax.annotation.Resource;
import java.util.List;

import com.gem.management_system.mapper.UserMapper;
import com.gem.management_system.pojo.User;
import com.gem.management_system.service.UserService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional      //事务管理
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> show() {
        return userMapper.getAllUsers();
    }

    @Override
    public void delUser(int id) {
        userMapper.delUser(id);

    }

    @Override
    public User getUser(int id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void upUser(User user) {
        userMapper.upUser(user);
    }

    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }
}
