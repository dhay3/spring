package chz.com.service;

import chz.com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
    //    @Autowired
//    @Qualifier(value = "student1")//如果有多个类型相同的,通过@Qualifier来指明装配的类
    //多个相同类型,在ioc中添加@Primary指定默认装配的bean
    private Student student;

    @Autowired//@Autowired也可以修饰构造函数,如果只有一个有参函数@Autowire可以省略,一般不建议省略
    public Service(Student student) {
        this.student = student;
    }

    public void print() {
        System.out.println(student);
    }

}
