package com.chz.convert;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component//功能组件一定要通过@Component加@ComponentScan的方式引入ioc,这是一种规范
public class MyConvert {
    @PostConstruct//jsr 250 ,初始化构造器之后执行
    public void init(){
        System.out.println("转换器初始化");
    }

    public MyConvert() {
        System.out.println("转换器构造器");
    }

    public void convert(){
        System.out.println("转换类型");
    }
    @PreDestroy //jsr 250 销毁之前调用
    public void destroy(){
        System.out.println("转换器销毁");
    }

}
