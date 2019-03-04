package com.gem.film_management.mapper;

import com.gem.film_management.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUser(@Param("name") String user, @Param("pwd") String pwd, @Param("type") String type);
    User getUserById(int id);
    void addUser(User user);
    int checkUserName(String name);

}
