package zzt.Dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zzt.pro.Student;
import zzt.utils.mybatisUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoTest {
     @Test
    public void getAllStudent(){
         SqlSession sqlSession = mybatisUtils.sqlSession();
         StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
         List<Integer>ids=new ArrayList<Integer>();
         ids.add(1);
         ids.add(2);
         ids.add(3);
         Map<String,Object> map=new HashMap<String, Object>();
         map.put("ids",ids);
         List<Student> allStudent =mapper.getStudentIn(map);

         for (Student student : allStudent) {
             System.out.println(student);
         }
         sqlSession.close();
     }
     @Test
     public void test(){
          SqlSession sqlSession = mybatisUtils.sqlSession();
          StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
          List<Student> allStudent = mapper.getAllStudent();
          for (Student student : allStudent) {
               System.out.println(student);
          }
          sqlSession.close();
          SqlSession sqlSession2 = mybatisUtils.sqlSession();
          StudentMapper mapper2 = sqlSession2.getMapper(StudentMapper.class);
          List<Student> allStudent2 = mapper2.getAllStudent();
          for (Student student : allStudent2) {
               System.out.println(student);
          }
          sqlSession2.close();

     }
}
