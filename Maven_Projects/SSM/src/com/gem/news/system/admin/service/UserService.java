package com.gem.news.system.admin.service;

import com.gem.news.system.admin.pojo.User;





public interface UserService {

	User getUser(String username, String pwd);
	//User getUser(User user);
}
