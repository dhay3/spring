package test.test4_annotation;

import org.springframework.stereotype.Component;
import test.test1.Student;
//通过注解添加到ioc
/**
 * 如果不加值默认是bean类的首写字母小写其他不变
 * @Component 将pojo放入ioc容器中(分不清楚是哪一个层)
 * @Repository 将dao放入ioc容器中(持久层)
 * @Controller 将控制器组件(前后端交互)放入ioc容器中
 * @Service 将BO放入到ioc容器中(业务层)
 */
//@Component("student_dao")
@Component
public class StudentDaoImpl {
    private int age;
    public void addStudent(Student s) {
        System.out.println("增加学生");
    }
}
