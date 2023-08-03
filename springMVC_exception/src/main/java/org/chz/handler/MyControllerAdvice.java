package org.chz.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice//会捕获所有类的异常,如果有相同的异常,专门处理异常的类
//如果处理异常的类优先级高于本类中的处理异常注解;@ControllerAdvice>@ExceptionHandler
public class MyControllerAdvice {
    @ExceptionHandler(ArithmeticException.class)
    public String myAdvice(){
        System.out.println("ControllerAdvice处理所有异常");
        return "success";
    }
}
