package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test1/spring-config.xml");
        MainTest main_test = (MainTest)context.getBean("main_test");
        main_test.maniFunctionBefore("chz");
//        main_test.mainFunctionAfter();
//        main_test.mainFunctionException();
//        main_test.mainFunctionInterceptor("hello");
//        System.out.println(main_test.mainFunctionInterceptor("hello"));
    }
}
