package com.chz.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//所有供用户调用的spring组件都是实现了Aware接口的
//ApplicationContextAware ioc容器组件
//BeanNameAware 获取当前bean注入ioc容器中(这里指的是MyApplicationContext注入到ioc)的名字
@Component("ccc")
public class MyApplicationContext implements ApplicationContextAware, BeanNameAware {
    private ApplicationContext context;
//    不能采用这种,因为main方法中的ioc容器和类中的ioc容器不是同一个
//    ApplicationContext context = new ClassPathXmlApplicationContext("");

    private String beanName;//操作这种方法拿到的值相当于操作ioc容器中的属性
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //让本类的context于ioc相同
        this.context=applicationContext;//这种方法拿到ioc容器和main方法中的ioc相同
        System.out.println(applicationContext);
        System.out.println("fffffffffffffffffffff");
    }

    @Override
    public void setBeanName(String name) {
        this.beanName=name;
        System.out.println(name);
    }

    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public String getBeanName() {
        return beanName;
    }
}
