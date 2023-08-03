package main.java.org.chz.handler;

import org.chz.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MyServlet2 {
    //为了高内聚,低耦合(返回值时null时,@ModelAttribute不会产生键值对对象存入model中)
    @ModelAttribute//在任何方法调用之前都先调用@ModelAttribute修饰的方法
//    public void queryById(Map<String, Object> map,Student student) {//同时会向request域中放一个student
    public void queryById(Map<String, Object> map) {
        Student student = new Student();
        student.setId(12);
        student.setUsername("王岐山");
        student.setAge(31);//原有的参数没有age,增加一个age参数到student中
        System.out.println(1+"  "+student);
//        map.put()也会向request域中添加一个参数
//        map.put("student", student);//传入到带有指定map的key(对应方法的参数类型首字母小写)的函数中
        map.put("stu", student);
        //能在原有的参数是null的基础上添加值,不会对已有值的参数覆盖
    }

    @RequestMapping("/setName")
    //从ModelAttribute中传过来的值和前端student中的值
//    public String setName(Student student) {//如果不加@ModelAttribute也会向request域中添加一个前端传回来的值
    //@ModelAttribute("stu")表示往request域中添加一个key为stu值为student的键值对
    public String setName( @ModelAttribute("stu") Student student) {
        System.out.println(2+"  "+student);//因为时传值,获取到的值还是未经处理的前端值
        student.setUsername("习近平");
        System.out.println("修改为" + student);
        return "test";
    }
}
