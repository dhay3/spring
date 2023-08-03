import com.chz.conf.MyConf;
import com.chz.context.MyApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    @org.junit.Test
    public void testContext() {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MyConf.class);
        System.out.println(context1 + "111111111111111");
    }
    @org.junit.Test
    public void test(){//说明自己配置的ApplicationContext和ioc容器是同一个
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MyConf.class);
        System.out.println(context1+"--------------------");
        System.out.println(context1.getBean(MyApplicationContext.class).getContext()+"++++++++++++++++");

    }
    @org.junit.Test
    public void testProfile() {//通过设置虚拟参数可以控制环境-Dspring.profiles.active=xxx
        //通过设置空参数
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();
        context1.getEnvironment().setActiveProfiles("myCat","myDog");
        //需要重新注册配置类,
        context1.register(MyConf.class);
        //ioc容器必须刷新
        context1.refresh();
        Object cat = context1.getBean("cat");
        System.out.println(cat);
        Object dog = context1.getBean("dog");
        System.out.println(dog);
        context1.getEnvironment().setActiveProfiles();
    }
    @org.junit.Test
    public void testFactoryBeanProcessor(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);

    }
}
