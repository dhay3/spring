import conf.MyConf2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.dog.Dog;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf2.class);
        Dog getDog1 = (Dog)context.getBean("getDog");
//        Dog getDog2 = (Dog)context.getBean("getDog");
//        System.out.println(getDog1==getDog2);

    }
}
