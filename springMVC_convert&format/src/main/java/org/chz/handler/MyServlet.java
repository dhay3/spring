package org.chz.handler;

import org.chz.entity.FormatTest;
import org.chz.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MyServlet {
    @RequestMapping("/convert")
    public void convert(@RequestParam("sInfo") Student student) {
        System.out.println(student);
    }

    @RequestMapping("/format")
    //如果参数有错误会把错误放入BindingResult,前端不再展示错误,直接跳转到指定页面
    //BindingResult保存前一个参数的错误消息,如果参数错误就会把错误放入BindingResult中,两者必须紧挨着
    public String format(FormatTest format, BindingResult bindingResult, Map<String,Object> map) {
        System.out.println(bindingResult);
//        将错误信息往前端传
        if (bindingResult.hasErrors()) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            map.put("errors",fieldErrors);
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError);
            }
        }
        System.out.println(format);
        return "success";
    }

}
