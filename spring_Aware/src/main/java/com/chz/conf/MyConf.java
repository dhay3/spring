package com.chz.conf;

import com.chz.pojo.Animal;
import com.chz.pojo.Cat;
import com.chz.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.chz")
public class MyConf {
    @Bean
//    @Profile("myCat")//只有在指定的环境下才会注入到ioc中
    public Animal cat() {
        return new Cat();
    }

    @Bean
//    @Profile("myDog")
    public Animal dog() {
        return new Dog();
    }
}
