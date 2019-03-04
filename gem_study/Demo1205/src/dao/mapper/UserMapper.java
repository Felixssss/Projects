package dao.mapper;

import pojo.AgeASC;
import pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getASC(AgeASC asc);
    public List<User> getSclass(String name);
}
