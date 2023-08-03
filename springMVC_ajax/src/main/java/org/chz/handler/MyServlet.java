package org.chz.handler;

import org.chz.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyServlet {
    //    @RequestMapping("/login")
//    public String register(@Valid Student student, BindingResult result, Model model){
//        if (result.hasErrors()){
//            List<FieldError> fieldErrors = result.getFieldErrors();
//            model.addAttribute("errors",fieldErrors);
//            for (FieldError fieldError : fieldErrors) {
//                System.out.println(fieldError.getDefaultMessage());
//            }
//        }
//        System.out.println(student);
//        return "success";
//    }

    //    @ResponseBody//不会走视图解析器,返回Json形式的参数到前端
//    @RequestMapping("/login")
//    public List<String> register(@Valid Student student, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            List<String> errors = new ArrayList<>();
//            List<FieldError> fieldErrors = result.getFieldErrors();
//            model.addAttribute("errors", fieldErrors);
//            for (FieldError fieldError : fieldErrors) {
//                System.out.println(fieldError.getDefaultMessage());
//                errors.add(fieldError.getDefaultMessage());
//            }
//            return errors;
//        }
//        System.out.println(student);
//        return null;
//    }
    //添加jackson-annotations 和jackson-core 和jackson-databind自动将带有@ResponseBody修饰的方法返回对象转为Json
    @ResponseBody//不会走视图解析器,返回Json形式的参数到前端
    @RequestMapping("/login")
    public Student register(@Valid Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            List<FieldError> fieldErrors = result.getFieldErrors();
            model.addAttribute("errors", fieldErrors);
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getDefaultMessage());
            }
        }
        System.out.println(student.getUsername() + student.getPassword());
        student.setUsername("张三");
//        如果是集合返回json数组
        return student;
    }
}
