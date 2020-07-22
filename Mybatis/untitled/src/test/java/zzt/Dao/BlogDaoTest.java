package zzt.Dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import zzt.pro.Blog;
import zzt.utils.IdUtils;
import zzt.utils.mybatisUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogDaoTest {
    @Test
    public void insert(){
        SqlSession sqlSession = mybatisUtils.sqlSession();
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("id", IdUtils.getIdUUID());
        map.put("title","明朝那些事");
        map.put("author","当年明月");
        map.put("createTime",new Date());
        map.put("view",100);
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.addBlog(map);
        sqlSession.close();
    }
    @Test
    public void add(){
        SqlSession sqlSession = mybatisUtils.sqlSession();
        Map<String,Object> map=new HashMap<String, Object>();
       /* map.put("id", IdUtils.getIdUUID());*/
        /*map.put("title","明朝那些事");*/
        map.put("author","张");
      /*  map.put("createTime",new Date());*/
      /*  map.put("view",100);*/
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogs =mapper.blogList(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public  void add2(){
        SqlSession sqlSession = mybatisUtils.sqlSession();
        Map<String,Object> map=new HashMap<String, Object>();
        /* map.put("id", IdUtils.getIdUUID());*/
        map.put("title","明朝那些事");
        map.put("author","张泽涛");
        /*  map.put("createTime",new Date());*/
        /*  map.put("view",100);*/
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        List<Blog> blogs =mapper.getBlog(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public  void update(){
        SqlSession sqlSession = mybatisUtils.sqlSession();
        Map<String,Object> map=new HashMap<String, Object>();
         map.put("id","1d67b93e");
        map.put("title","明朝那些事");
        map.put("author","张泽涛");
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.update(map);
        sqlSession.close();
    }
}
