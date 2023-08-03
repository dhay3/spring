package conf.factory;

import org.springframework.beans.factory.FactoryBean;
import pojo.tiger.Tiger;
//继承FactoryBean,通过@Bean的方式实现注入ioc
public class MyFactoryBean implements FactoryBean<Tiger> {
    @Override//ioc中的bean是什么
    public Tiger getObject() throws Exception {
        return new Tiger();
    }

    @Override//返回值是什么类型,context.getBean()拿到类型
    public Class<?> getObjectType() {
        return Tiger.class;
    }

    @Override//是否是单例模式
    public boolean isSingleton() {
        return true;
    }
}
