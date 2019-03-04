package com.gem.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
    public static SqlSessionFactory getSqlSessionFactory() throws IOException{
        String resource = "SqlSessionConfig.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
    public static SqlSession getSqlSession () throws IOException{
        SqlSession session=getSqlSessionFactory().openSession();
        return session;
    }
}
