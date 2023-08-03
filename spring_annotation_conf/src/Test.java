import conf.MyConf;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("conf");
//        System.out.println(context.containsBean("getCat"));
        System.out.println(context.containsBean("getDog"));
//        System.out.println(context.containsBean("Dog"));
//        Dog bean = context.getBean(Dog.class);
//        System.out.println(bean);
    }
}
