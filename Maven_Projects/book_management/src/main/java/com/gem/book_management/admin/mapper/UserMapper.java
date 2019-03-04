package com.gem.book_management.admin.mapper;

import com.gem.book_management.admin.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User getUser(@Param("username") String username, @Param("pwd") String pwd);
}
