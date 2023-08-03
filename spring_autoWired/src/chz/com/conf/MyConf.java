package chz.com.conf;

import chz.com.pojo.Address;
import chz.com.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = {"chz.com"})
public class MyConf {

    @Bean
    @Primary//多个类型,默认装配@Primary的类
    public Student student1(Address address){//如果bean的函数带参数,那么参数必须是ioc容器中的
        return new Student("zs",10,address);
    }

    @Bean
    //在@Bean中其实是省略了@AutoWired,推荐加上@AutoWired
//    public Student student2(Address address){
    public Student student2(@Autowired Address address){
        return new Student("ls",2,address);
    }

    @Bean
    public Address address(){

        return new Address("bj","sh");
    }

}
