package conf;

import conf.condition.CatCondition;
import conf.condition.DogCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import pojo.cat.Cat;
import pojo.dog.Dog;

@Configuration
public class MyConf4 {

    @Bean
    @Conditional(CatCondition.class)
    public Cat cat(){
        return new Cat();
    }
    @Bean
    @Conditional(DogCondition.class)
    public Dog dog(){
        return new Dog();
    }
}
