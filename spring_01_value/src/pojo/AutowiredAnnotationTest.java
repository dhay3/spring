package pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("autowired")
/**
 * 使用@Autowired最好时在构造器和setter方法上,不推荐属性(虽然也可以)
 * @autowired 所在的类也必须是注解形式实现的,或是通过xml注入ioc
 * 因为注入ioc的JavaBean是单例模式的,所以不能被new
 * 在自定义类中的@AutoWired也要归ioc管理,否则拿不到ioc中对应@Autowired的值
 */
public class AutowiredAnnotationTest {

    private Student student;

    public Student getStudent() {
        return student;
    }
    @Autowired//autowire默认byType,qualifier主动用名字去匹配
    @Qualifier("student")//如果autowired的bean的不唯一要通过@Qualifier指定bean的name
    public void setStudent(Student student) {
        this.student = student;
    }

    public void function() {
        System.out.println(student);
    }

    @Override
    public String toString() {
        return "AutowiredAnnotationTest{" +
                "student=" + student +
                '}';
    }
}
