package org.chz.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyHandlerException {
    //自定义异常的@ResponseStatus
    @RequestMapping("normal")
    public String normal(int i) throws MyResponseStatus2 {
        if (i==3){
            throw new MyResponseStatus2();
        }
        return "success";
    }

    @RequestMapping("/arithmeticException")
    public String arithmeticExceptionTest() {
        System.out.println("hello");
        System.out.println(1 / 0);
        return "success";
    }
    @RequestMapping("/NumberFormatException")
    public String NumberFormatException() {
        System.out.println("hello");
        Integer.parseInt("f1");
        return "success";
    }
    @RequestMapping("/IndexOutOfBoundsException")
    public String indexOutOfBounds() {
        System.out.println("hello");
        int[] a=new int[3];
        a[4]=3;
        return "success";
    }

    //捕捉指定异常并调用该方法,相当于try...catch
//    @ExceptionHandler(ArithmeticException.class)
//    public String world(){
//        System.out.println("exception");
//        return "error";
//    }

//    本类中两个异常都能捕获,就近原则处理异常,如果有全局的异常处理类就走全局的异常处理
    @ExceptionHandler(ArithmeticException.class)//注解不给值时,当作所有异常处理方法
    public String arithmeticException(Exception e) {//参数就是异常类,不会自动将异常传到前端
        System.out.println("handler中调用");
        System.out.println("ArithmeticException:" + e.getMessage());
        return "error";
    }

    @ExceptionHandler(NumberFormatException.class)
    //将异常传到前端,参数中只能有一个参数就是异常
    public ModelAndView NumberFormatException(Exception e) {//参数中不能有model,map,modelAndView...
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("error", e);
        System.out.println("NumberFormatException:" + e.getMessage());
        return modelAndView;
    }
    @ExceptionHandler(IndexOutOfBoundsException.class)
    //将异常传到前端
    public ModelAndView IndexOutOfBoundsException(Exception e) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("error", e);
        System.out.println("NumberFormatException:" + e.getMessage());
        return modelAndView;
    }
}
