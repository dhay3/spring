package com.chz.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString//普通javabean用@Bean的形式注入ioc容器中
public class Student {
    private String username;
    private Integer age;

    public Student() {
        System.out.println("无参构造器");
    }

    public Student(String username, Integer age) {
        System.out.println("有参构造器");
        this.username = username;
        this.age = age;
    }
    public void myInit(){
        username="bender";
        System.out.println("myInit");
    }
    public void myDestroy(){
        System.out.println("myDestroy");
    }
}
