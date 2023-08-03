package org.chz.handler;

import org.chz.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//访问@RequestMapping的url必须要加入到ioc中
public class MyServlet {
@RequestMapping("test")
    public String f(Student student){
        return "success";
    }
}
