package org.chz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHandler {
    //restful风格用{}来接收参数
    @RequestMapping("hello/{username}")
    public String myServlet(@PathVariable("username") String name){
        System.out.println(name);
        return "hello";
    }
    @RequestMapping("world.jsp")
    public void myServlet(){
        //不拦截文件的访问(除静态资源),如拦截.jsp文件
        System.out.println("fuck u");
    }
    @RequestMapping("world.do")
    public void myServlet2(){
        //    /拦截所有非文件url(包括静态资源的访问 .css .png .js)
        System.out.println("ccp die");
    }
}
