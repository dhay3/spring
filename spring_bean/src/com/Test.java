package com;

import com.chz.conf.MyConf;
import com.chz.convert.MyFunc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConf.class);
//        Student bean = context.getBean(Student.class);
        MyFunc bean = context.getBean(MyFunc.class);
//        System.out.println(bean);
        //ioc容器销毁,bean销毁

        context.close();
    }
}
