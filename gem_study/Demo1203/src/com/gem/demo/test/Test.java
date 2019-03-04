package com.gem.demo.test;

import java.io.IOException;

import com.gem.demo.UserDAO;
import com.gem.demo.pojo.User;

public class Test {
    public static void main(String[] args) {
        UserDAO userDAO=new UserDAO();
		/*try {
			List<User> users=userDAO.getAllUser();
			for (User user : users) {
				System.out.println(user);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

        //测试  id查询
		/*try {
			User user=userDAO.getUserById(1);
			System.out.println(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

        //测试 add
        try {
            userDAO.addUser(new User(0,"李四",30));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
