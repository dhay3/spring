import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.AutowiredAnnotationTest;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        ValueTest loader = (ValueTest)context.getBean("value");
//        System.out.println(loader);

//        AutowiredAnnotationTest autowired = (AutowiredAnnotationTest)context.getBean("autowired");
//        autowired.function();
//        System.out.println();

        new AutowiredAnnotationTest().function();
    }
}
