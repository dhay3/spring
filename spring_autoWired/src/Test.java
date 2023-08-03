import chz.com.conf.MyConf;
import chz.com.service.Service2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(MyConf.class);
//        Service service = (Service)c.getBean("service");
        Service2 service = (Service2)c.getBean("service2");
        service.print();
    }
}
