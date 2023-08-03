package org.chz.handler;

import org.chz.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyServlet2 {
    //request域中放入了一个(k=student,v=)
//    @ModelAttribute("std")
    public Student queryById() {
        System.out.println("testteststst");
//        Student student = new Student();
//        student.setId(12);
//        student.setUsername("王岐山");
//        student.setAge(31);
//        System.out.println(1+"  "+student);
//        map.put("stu", student);
        return new Student(12,"王琦山",23);
    }

    @RequestMapping("/setName")
    public String setName(String username) {
        System.out.println(username);
        return "test";
    }
//
//    @RequestMapping("/fff")
//    public String f(Student student){
//        System.out.println(student);
//        return "test";
//    }
}
