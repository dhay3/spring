package org.chz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pv")
public class PathVariableTest {
    //指定hello后面的第一个参数是username并把username对应url的值赋给函数的参数
    @RequestMapping("/hello/{username}")
//    @PathVariable中的value对应@RequsetMapping中的{}
    public String hello(@PathVariable("username") String name) {
        System.out.println(name);//拿到对应url的参数
        return "world";
    }

    @RequestMapping("/world.jsp")
    public String h() {
        return "test";
    }
}
