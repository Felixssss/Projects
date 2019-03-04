package test;

import dao.mapper.StudentMapper;

import org.apache.ibatis.session.SqlSession;
import pojo.AgeASC;
import pojo.User;
import util.MyBatisUtil;

import java.io.IOException;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        System.out.println(mapper.getStudentByName(3));

        /*AgeASC asc =new AgeASC();
        asc.setConlumn("age");
        List<User> users = mapper.getASC(asc);
        for (User user1:users){
            System.out.println(user1);
        }*/
    }
}
