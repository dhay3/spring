package org.chz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//    Rest风格
public class TestFilter {
    //    拦截post对应sql insert
    @RequestMapping(value = "/testRest/{num}", method = RequestMethod.POST)
    public String testPost(@PathVariable("num") int id) {
        System.out.println("POST: 增" + id);
        return "post";
    }

    //拦截delete对应sql delete,实际请求方式是隐藏域中的value
    @RequestMapping(value = "/testRest/{num}", method = RequestMethod.DELETE)
    public String testDelete(@PathVariable("num") String id) {
        System.out.println("DELETE: 删");
        return "delete";
    }

    //拦截put对应sql update,实际请求方式是隐藏域中的value
    @RequestMapping(value = "/testRest/{num}", method = RequestMethod.PUT)
    public String testPut(@PathVariable("num") String id) {
        System.out.println("PUT: 改"+id);
        return "put";
    }

    //拦截get对应sql select
    @RequestMapping(value = "/testRest/{num}", method = RequestMethod.GET)
    public String testGet(@PathVariable("num") int id) {
        System.out.println("GET: 查" + id);
        return "get";
    }
}
