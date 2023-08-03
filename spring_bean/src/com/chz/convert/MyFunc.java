package com.chz.convert;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service//功能组件一定要通过@Component加@ComponentScan的方式引入ioc,这是一种规范
//InitializingBean初始化接口,同@PostConstruct
//DisposableBean销毁接口,同@PreDestroy
public class MyFunc implements InitializingBean, DisposableBean {
    private String name;
    public void myFunc(String name){
        System.out.println("我的功能键");
    }
    public MyFunc(){
        System.out.println("this is MyFunc");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("销毁");
    }
}
