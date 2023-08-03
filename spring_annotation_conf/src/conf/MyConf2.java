package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import pojo.dog.Dog;

//@Configuration
//@Configuration是一个单独的配置类如果想要在其他类中生效需要@Import,import的不用是@Configuration注解的
public class MyConf2 {
    @Bean
//    单例模式会在ioc容器启动时就会在堆中产生bean(之后不会产生新的bean),多例模式自会在向ioc容器请求时产生bean
//    单例也支持延迟加载,在第一次使用时产生(获取bean时)
//    @Scope("prototype")//spring bean默认时单例模式的,使用@Scope修改模式
    @Lazy//延迟加载,只会在调用时加载bean
    public Dog getDog() {
        return new Dog();
    }

}
