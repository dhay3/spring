import conf.MyConf3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf3.class);
        String[] names = context.getBeanDefinitionNames();//能拿到@Configuraton注入的类
        for (String name : names) {
            System.out.println(name);
        }

    }
}
