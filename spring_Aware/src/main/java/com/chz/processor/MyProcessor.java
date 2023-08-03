package com.chz.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

//拦截ioc容器
@Component
public class MyProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //根据bean name,id获取bean
        BeanDefinition bean = beanFactory.getBeanDefinition("dog");
        System.out.println(bean);
        int count = beanFactory.getBeanDefinitionCount();
        System.out.println(count);
        String[] names = beanFactory.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
