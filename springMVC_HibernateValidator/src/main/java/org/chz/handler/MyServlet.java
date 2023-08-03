package org.chz.handler;

import org.chz.format.MyFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyServlet {
    @RequestMapping("/hello")
//    public String hello(@Valid MyFormat format){
    //接收前端参数是如要向规格化加@Valid
    public String hello(@Valid MyFormat format, BindingResult result, Model model){
        if (result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                System.out.println(fieldError.getDefaultMessage());
                model.addAttribute("errors",fieldErrors);
            }
        }
        System.out.println(format);
        return "hello";
    }
}
