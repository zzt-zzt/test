package zzt.Dao;

import zzt.pro.Student;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    List<Student> getAllStudent();
    List<Student> getStudentIn(Map map);
}
