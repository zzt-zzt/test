package zzt.pro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
//序列化(存入二级缓存是要用到)
public class Student implements Serializable {
    private  Integer id;
    private  String name;

}
