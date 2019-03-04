package com.gem.springboottest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.gem.springboottest.pojo.User;
import com.gem.springboottest.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gem.springboottest.mapper.UserMapper;
import com.github.pagehelper.PageInfo;
@Service
@Transactional //事务管理
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMapper;
	@Override
	public List<User> show() {
		// TODO Auto-generated method stub
		return userMapper.getAllUsers();
	}
	@Override
	public void delUser(int id) {
		userMapper.delUser(id);
		
	}
	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userMapper.getUserById(id);
	}
	@Override
	public void upUser(User user) {
		userMapper.upUser(user);
		
	}
	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
		
	}
	@Override
	public PageInfo<User> getAllFileBypay(int curPage) {
		
		return null;
	}
}
