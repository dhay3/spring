package org.chz.handler;

import org.chz.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/**
 * forward和redirect不经过InternalResourceViewResolver也不经过ResourceBundleMassageSource(JstlView)
 * forward和redirect都要写出全路径，redirect请求两次url地址栏改变，forward请求一次url地址栏不变
 */
public class MyServlet {
    @RequestMapping("/welcome")
    public String welcome() {
        System.out.println("welcome");
//        return "redirect:views/welcome.jsp";//重定向ResourceBundleMassageSource无效
//        return "forward:views/welcome.jsp";//请求转发ResourceBundleMassageSource无效
        //只有通过视图解析器ResourceBundleMassageSource才会生效
        return "welcome";
    }

    @RequestMapping(path = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/convert")
    //前端传过来字符串2-zs-23经过convert处理变成student,用student接收
    public void convertToStudent(Student student) {
        System.out.println(student);
    }
}
