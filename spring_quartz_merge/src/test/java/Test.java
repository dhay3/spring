import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws SchedulerException {
        //应为ioc是单例模式会自动加载bean,SchedulerFactoryBean中有一个autoStartUp会自动启动
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
//        SchedulerFactoryBean bean = context.getBean(SchedulerFactoryBean.class);
//        MyPlan bean = context.getBean(MyPlan.class);
//        bean.getScheduler().start();
        //直接启动也可以调用
//        bean.start();
    }
}
