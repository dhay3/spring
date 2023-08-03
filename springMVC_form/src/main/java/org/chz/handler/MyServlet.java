package org.chz.handler;

import org.chz.dto.CheckBoxTest;
import org.chz.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

@Controller
public class MyServlet {
    @RequestMapping("/hello")
    public String hello(Map<String , User> map){
//        自动绑定key是command的对象,key必须是command
        map.put("command",new User("老王八","海底"));
        return "success";
    }
    @RequestMapping(path = "/test",method = RequestMethod.POST)
    public void post(){
        System.out.println("post");
    }
    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public void get(){
        System.out.println("get");
    }
    @RequestMapping(path = "/test",method = RequestMethod.DELETE)
    public void delete(){
        System.out.println("delete");
    }
    @RequestMapping(path = "/test",method = RequestMethod.PUT)
    public void put(){
        System.out.println("put");
    }
    @RequestMapping("/checkbox")
    public String checkbox(Map<String, CheckBoxTest> map){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"football","basketball");
        CheckBoxTest checkBoxTest = new CheckBoxTest();
        checkBoxTest.setList(list);
        checkBoxTest.setCountry("uk");
        map.put("command",checkBoxTest);
        return "checkbox";
    }
}

