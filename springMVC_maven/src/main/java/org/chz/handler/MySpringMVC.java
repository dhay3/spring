package org.chz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//可以给类添加url,拦截url是mvc的请求
//@RequestMapping("/mvc")//映射路径
/*
传入多个参数时要用大括号，当age为空的时候也会拦截
value拦截指定url
method指定请求方式（get,post,delete,put）,只有是指定提交方法的url才会被拦截
params指定参数,只有包含指定参数(name="xxx")的url才能被拦截,同时也可以指定value的值,
 */
@RequestMapping(value = "/mvc",
//        只拦截post请求
        method = RequestMethod.POST,
//        只要有name="username"就行
//        params = "username"
//        必需要有name="username"，且username的value时chz,age不等于1
//        params = {"username=chz", "age!=1"},
        //参数中不能有height，即name!="height"
        params = {"username=chz", "age!=1","!height"})
public class MySpringMVC {
    //拦截url是hello请求运行hello()
    @RequestMapping("/hello")//如果给类添加url相当于请求的路劲是/mvc/hello
    public String hello() {
        //经过springMVC的InternalResourceViewResolver处理 /views/(前缀)world(后缀).jsp
        //默认使用请求转发 地址栏的url不会变,发送两次请求
        return "world";
    }
}
