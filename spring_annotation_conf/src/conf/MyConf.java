package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import pojo.cat.Cat;

//@Configuration是一个单独的配置类如果想要在其他类中生效需要@Import
//@Configuration
//导入其他配置类
@Import(MyConf2.class)//导入的类不用是@Configuration修饰的类,但是为了区别普通pojo最好加@Configuration
//@Import(Dog.class)//导入普通类也会生效
public class MyConf {
    @Bean
    public Cat getCat(){
        return new Cat();
    }

}
