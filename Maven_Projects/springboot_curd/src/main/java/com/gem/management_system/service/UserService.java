package com.gem.management_system.service;

import com.gem.management_system.pojo.User;

import java.util.List;

public interface UserService {
    List<User> show();
    void delUser(int id);
    User getUser(int id);
    void upUser(User user);
    void addUser(User user);
}
