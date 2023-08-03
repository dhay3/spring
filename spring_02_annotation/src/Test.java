import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.MainTest;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        MainTest mainTest = (MainTest)context.getBean("mainTest");
        mainTest.mainFunction("chz");
//        mainTest.mainFunctionException();
//        int i = mainTest.mainFunctionAround();
//        System.out.println("---------"+i);
    }
}
