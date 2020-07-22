package zzt.Dao;

import zzt.pro.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Map map);
    List<Blog> blogList(Map map) ;
    List<Blog> getBlog(Map map);
    int update(Map map);

}
