package zzt.Dao;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import zzt.pro.User;
import zzt.utils.mybatisUtils;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void test(){
        //1.获取sqlSession对象
        SqlSession sqlSession = mybatisUtils.sqlSession();
        logger.info("啦啦啦");
        //2.执行Sql语句(相当于与UserDAO建立联系）
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser = mapper.getAllUser();
        for (User user : allUser) {
            System.out.println(user);
        }
        //关闭sqlsession
        sqlSession.close();
    }
    @Test
    public void getUserById(){
        //获取sqlsession对象
        SqlSession sqlSession = mybatisUtils.sqlSession();
        //获取UserMapper接口对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //执行sql语句
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        //sqlsession对象的关闭
        sqlSession.close();
    }
    @Test
    public void insertUser(){

    }
    @Test
    public void updateUser(){
                SqlSession sqlSession=mybatisUtils.sqlSession();
                UserMapper mapper = sqlSession.getMapper(UserMapper.class);
                mapper.updateUser(new User(3,"赵六"));
                sqlSession.commit();
                sqlSession.close();
            }
            @Test
//    增删改查 要加sqlsession.commit
            public void deleteUser(){
                SqlSession sqlSession=mybatisUtils.sqlSession();
                UserMapper mapper = sqlSession.getMapper(UserMapper.class);
                mapper.deleteUser(3);
                sqlSession.commit();
                sqlSession.close();
            }
            @Test
            public void getUser(){
                SqlSession sqlSession=mybatisUtils.sqlSession();
                UserMapper mapper = sqlSession.getMapper(UserMapper.class);
                List<User> list = mapper.getUser("张");
                for (User user : list) {
                    System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void limit(){
        SqlSession sqlSession = mybatisUtils.sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Integer> map=new HashMap<String, Integer>();
        map.put("start",0);
        map.put("size",2);
        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user : userByLimit) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
