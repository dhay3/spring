import com.chz.plan.MyPlan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
//        MyPlan bean = context.getBean(MyPlan.class);
//        bean.getUp();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    }
}
