package com.gem.demo;

import java.io.IOException;
import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.gem.demo.pojo.User;
import com.gem.demo.util.MyBatisUtil;

public class UserDAO {
    //查询所有
    public List<User> getAllUser() throws IOException{
        //执行sql
        SqlSession session=MyBatisUtil.getSqlSession();
        List<User> users=session.selectList("com.gem.demo.pojo.UserMapper.getAllUsers");
        session.close();
        return users;
    }
    //id查询
    public User getUserById(int id) throws IOException{
        SqlSession session=MyBatisUtil.getSqlSession();

        User user=session.selectOne("com.gem.demo.pojo.UserMapper.getUserById",id);
        session.close();
        return user;
    }
    //新增
    public void addUser(User user) throws IOException{
        SqlSession session=MyBatisUtil.getSqlSession();
        int row=session.insert("com.gem.demo.pojo.UserMapper.addUser",user);
        //提交事务  更新
        session.commit();
        //关闭资源
        session.close();
        if(row>0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
    //删除
    //修改
}