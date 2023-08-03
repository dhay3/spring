package com.chz.convert;

import com.chz.pojo.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Controller;

@Controller
public class MyFunc2 implements BeanPostProcessor {
    @Override//容器中所有bean都初始化
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("beanName:"+o+"初始化");
        if ( o instanceof Student){
            Student student=(Student) o;
            student.setUsername("Xxx");
//            return student;//这里不用返回student,o通过判断原本就是Student类型的
        }
        return o;
    }

    @Override//容器中所有bean都销毁
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("beanName:"+o+"销毁");
        return o;
    }
}
