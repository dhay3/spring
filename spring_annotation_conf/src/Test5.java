import conf.MyConf5;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf5.class);
        Object bean1 = context.getBean("bean");
        System.out.println(bean1);
        Object bean2 = context.getBean("&bean");//通过添加&获取工厂类
        System.out.println(bean2);

    }
}
