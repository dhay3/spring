package org.chz.handler;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MyResponseStatus {
//    修饰方法
    @RequestMapping("/ResponseStatus")
    //@ResponseStatus一定会抛出异常,但是如果方法本身没有异常方法,会执行完毕当前方法
    @ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "文件消失了???")
    public String my(){
        System.out.println("ResponseStatus....");
        return "error";
    }
}
