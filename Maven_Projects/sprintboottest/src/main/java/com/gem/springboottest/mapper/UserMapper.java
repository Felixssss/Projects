package com.gem.springboottest.mapper;

import java.util.List;

import com.gem.springboottest.pojo.User;

public interface UserMapper {
	List<User>  getAllUsers();
	void delUser(int id);
	User getUserById(int id);
	void upUser(User user);
	void addUser(User user);
}
