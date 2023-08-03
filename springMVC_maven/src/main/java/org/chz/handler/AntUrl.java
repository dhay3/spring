package org.chz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chz")
public class AntUrl {
    @RequestMapping(value = "/header",
            //拦截指定请求头
            headers = {
                    "Accept= text/html,application/xhtml+xm…ml;q=0.9,image/webp,*/*;q=0.8",
                    "Accept-Encoding= gzip, deflate"})
    public String hello() {
        return "world";
    }

    @RequestMapping("/*/ant")// *表示任意长度任意字符
    public String hello2() {
        return "world";
    }

    @RequestMapping("/a?c/ant")// ?表示任意单字符
    public String hello3() {
        return "world";
    }

    @RequestMapping("/**/anttt")// **表示任意目录和子目录包括*
    public String hello4() {
        return "world";
    }
}
