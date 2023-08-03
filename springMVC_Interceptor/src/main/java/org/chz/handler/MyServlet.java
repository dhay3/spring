package org.chz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyServlet {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "success";
    }
    @RequestMapping("/world")
    public String world(){
        System.out.println("world");
        return "error";
    }
}
