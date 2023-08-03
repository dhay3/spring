package pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//@Component
@Data
//@Component

public class Student {
//    private Dog dog;
    public Student(String name) {
        System.out.println(name+"构造器函数");
    }

    public Student() {
        System.out.println("gou");
    }

    //左边的p叶子表示是spring的property
    public void setName( String name1) {//方法名必须是setxxx
        System.out.println("调用方法"+name1);
    }
}
