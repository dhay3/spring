import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("hhhhhh");
//        pojo.Student s = (pojo.Student)context.getBean("s");
//        context.getBean(Student.class).stName(null);
//        System.out.println(s);

    }
}
