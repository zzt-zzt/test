package zzt.utils;

import org.junit.Test;

import java.util.UUID;

public class IdUtils {
    public  static String getIdUUID(){
        String replace = UUID.randomUUID().toString().substring(0,8).replace("-", "");
        return  replace;
    }
    @Test
    public void test(){
        System.out.println(IdUtils.getIdUUID());
    }
}
