package com.gem.springboottest.service;

import java.util.List;

import com.gem.springboottest.pojo.User;

import com.github.pagehelper.PageInfo;

public interface UserService {
	List<User> show();
	void delUser(int id);
	User getUser(int id);
	void upUser(User user);
	void addUser(User user);
	//分页查询：
	public PageInfo<User> getAllFileBypay(int curPage);
}
