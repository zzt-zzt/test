package zzt.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mybatisUtils {
    /*
    * 工具类作用 （1)加载配置文件     （2)获取操作mysql的sqlsession对象
    * */
    private  static SqlSessionFactory sqlSessionFactory;//提升作用域
    static {

        InputStream inputStream = null;
        try {
            String source="mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(source);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public  static SqlSession sqlSession(){
        return  sqlSessionFactory.openSession(true);
    }
}
