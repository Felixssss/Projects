package com.gem.news.system.admin.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gem.news.system.admin.mapper.UserMapper;
import com.gem.news.system.admin.pojo.User;

import com.gem.news.system.admin.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userMapper;

	/*@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.getUser(user);
	}
*/
	@Override
	public User getUser(String username, String pwd) {
	
		return userMapper.getUser(username, pwd);
	}



}
