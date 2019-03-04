package com.gem.book_management.admin.service;

import com.gem.book_management.admin.pojo.User;

public interface UserService {
    User getUser(String username, String pwd);
}
