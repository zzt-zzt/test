package zzt.Dao;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import zzt.pro.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
      List<User>getAllUser();
      @Select("select * from user where id=#{id}")
      User getUserById(@Param("id") int id);
      //更新
      @Insert("insert into user(id,name)values(#{id},#{username}")
      int  updateUser(User user);
      //插入
      int addUser(User user);
      //删除
      void deleteUser(int id);
      //模糊查询
      List<User>getUser(String name);
      //分页查询
      List<User>getUserByLimit(Map<String,Integer>map);
}
