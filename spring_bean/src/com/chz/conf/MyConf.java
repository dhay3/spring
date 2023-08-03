package com.chz.conf;

import com.chz.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//普通的javabean通过@Bean的形状注入ioc,功能性类用@ComponentScan形式注入类
@ComponentScan("com.chz")
public class MyConf {
    //指定类中的初始方法和销毁方法,先创建bean(调用构造器)然后再init
    //@Bean通过构造器注入ioc
//    @Bean(initMethod = "myInit",destroyMethod = "myDestroy")
//    @Scope("prototype")
    @Bean
    public Student student(){
        //init方法会覆盖构造器赋值
        return new Student("zs",10);
    }
}
