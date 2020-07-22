package zzt.Dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zzt.pro.Teacher;
import zzt.utils.mybatisUtils;

import java.util.List;

public class TeacherDaoTest {
    @Test
    public void getAllTeacher(){
        SqlSession sqlSession = mybatisUtils.sqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher allTeacher = mapper.getAllTeacher(1);
        System.out.println(allTeacher);
        sqlSession.close();
    }
}
