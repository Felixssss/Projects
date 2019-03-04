package com.gem.news.system.admin.mapper;

import org.apache.ibatis.annotations.Param;

import com.gem.news.system.admin.pojo.User;


public interface UserMapper {

	User getUser(@Param("username") String username, @Param("pwd") String pwd);
	//User getUser(User user);
}
