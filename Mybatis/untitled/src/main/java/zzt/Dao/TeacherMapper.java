package zzt.Dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import zzt.pro.Teacher;

import java.util.List;

public interface TeacherMapper {
       Teacher getAllTeacher(@Param("id") int id);
}
