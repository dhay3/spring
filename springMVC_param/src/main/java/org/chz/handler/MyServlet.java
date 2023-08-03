package main.java.org.chz.handler;

import org.chz.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Map;

@Controller
/**
 * 自动封装的类要有getter和setter
 */
//@SessionAttributes前提request中必须有
//如果在request域中存放student同时session中也存放一个student(session包含request)
//@SessionAttributes("student")
//@SessionAttributes("student1,student2")存放多个对象
//如果要在request域中存放指定类型数据在session域中存放指定类型的数据,对应的key是request的key
//@SessionAttributes(types =Student.class)
//@SessionAttributes(types ={Student.class,Address.class})//存放多个类型是
public class MyServlet {
    /*前端传送的参数数目可以大于后端的,但是不能小于后端所需求的参数数目
       添加一个required=false表示后端该参数不是必需的*/
    @RequestMapping("/form")
    //形参名对应表单中的name的值
    //如果形参名和表单中的name的值不对应通过@RequestParam来指定
    public String form(@RequestParam("username") String username,
//                       required=false表示属性不是必需的,
//                       如果前端没有传参数值默认就是null,加了defaultValue没有传值是就是defaultValue的值
                       @RequestParam(value = "age", required = false, defaultValue = "23") String age) {
        //value和path是同一个东西
        System.out.println(username + age);
        return "world";
    }

    @RequestMapping("/restful/{username}/{age}")
    //通过restful风格传参数,restful要给每一个形参加@PathVariable,如果不给值默认是形参名对应url中的参数
    public String restful(@PathVariable("username") String username,
//                          required=false表示该属性不是必需的
                          @PathVariable(value = "age", required = false) String age) {
        System.out.println(username + age);
        return "world";
    }

    @RequestMapping("/requestHeader")
    //@RequestHeader获取请求头
    public String requestHeader(@RequestHeader("Accept-Language") String header) {
        System.out.println(header);
        return "world";
    }

    @RequestMapping("/cookie")
    /*@CookieValue获取cookie的值
     客户端第一次访问服务端时,服务端会分给客户端一个session(该session包含一个sessionId)
     并且服务端会在第一次响应客户端时,将该sessionID赋值给JSESSIONID并传给客户端
     cookie包含JSESSIONID
     */
    public String cookie(@CookieValue("JSESSIONID") String JSESSIONID) {
        System.out.println(JSESSIONID);
        return "world";
    }

    @RequestMapping("/object")
//    springMVC自动封装对象属性,如果前端传参数数目小于后端类中属性的个数是,属性赋值为null
    public String objectObjectProperties(Student student) {//Student的属性必需和form表单name的值一致(支持级联属性)
        System.out.println(student);
        return "world";
    }

    @RequestMapping("/servlet")
    //直接可以通过传参数获取原生的servlet-api获取类,接口
    public String testServlet(Student student, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        System.out.println(student);
        return "world";
    }

    @RequestMapping("/modelAndView")
    //ModelAndView带参数返回指定视图addObject
    public ModelAndView testModelAndView(Student student) {
        //相当于给ModelAndView中的view属性赋值为world, 视图解析器仍然生效
        ModelAndView modelAndView = new ModelAndView("world");
        //放入request域中
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @RequestMapping("/modelMap")
    //modelMap可以通过put和addAttribute都可以向前端传值
    public String testModelMap(ModelMap modelMap) {
        Student student = new Student();
        student.setUsername("张小三");
        modelMap.addAttribute("student", student);
//        modelMap.put("student",student);
        return "world";
    }

    @RequestMapping("/model")
    //model addAttribute
    public String testModel(Model model) {
        Student student = new Student();
        student.setUsername("张小四");
//        modelMap.addAttribute("student",student);
        model.addAttribute("student", student);
        return "world";
    }

    @RequestMapping("/map")
    //map put
    public String testMap(Map<String, Object> map) {
        Student student = new Student();
        student.setUsername("长大三");
        map.put("student", student);
        return "world";
    }

    @RequestMapping("/returnObj")
//    springMVC自动封装对象时(除基本类型和String以外),会在ioc容器中生成一个按参数类型bean
//    jsp中可以通过el表达式拿到,key为参数类型(首字母小写),value时封装的对象,可以在当前函数中修改该对象属性
    public String returnObj(Student student) {
        student.setUsername("王八蛋");
//        student.setAge(199);
        System.out.println(student);
        return "world";
    }
}

