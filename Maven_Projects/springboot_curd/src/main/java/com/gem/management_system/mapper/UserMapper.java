package com.gem.management_system.mapper;

import com.gem.management_system.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User>  getAllUsers();
    void delUser(int id);
    User getUserById(int id);
    void upUser(User user);
    void addUser(User user);
}
