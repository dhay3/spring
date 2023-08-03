package chz.com.service;

import chz.com.pojo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class Service2 {
//    @Resource//jdk提供,按照名字(属性名)来自动装配;如果没有就会按照类型自动装配
//    @Resource(name = "student1")//按重新指定名字的装配
    @Resource( type=Student.class)//按照类型来装配
    private Student student2;

    public void print() {

    }
}
