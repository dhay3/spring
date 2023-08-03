package conf;

import conf.MyImport.MyImport;
import conf.factory.MyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import({Cat.class, Dog.class})//引入已经定义好的类
@Import(value = {MyImport.class})//导入实现ImportSelector接口的类
public class MyConf5 {
    @Bean//注入工厂中的bean,和工厂
    public MyFactoryBean bean(){
        return new MyFactoryBean();//返回工厂类型默认是工厂中的bean
    }
}
