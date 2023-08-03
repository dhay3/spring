package org.chz.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan()
public class MyConf {
    @Bean
    public A getA(){
        return new A();
    }

}
class A{

}
