package com.gem.film_management.service;

import com.gem.film_management.pojo.User;

public interface UserService {
    User getUser(String name, String pwd ,String type);
    User getUserById(int id);
    void addUser(User user);
    int checkUserName(String name);

}
