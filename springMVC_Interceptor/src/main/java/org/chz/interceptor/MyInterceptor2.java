package org.chz.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//springMVC拦截器,实现HandlerInterceptor,和filter一样有chain
public class MyInterceptor2 implements HandlerInterceptor {
    @Override
    //请求之前调用,如果该方法返回true会执行后续的下一个Interceptor和Controller
    // 如果想要Controller继续执行最后一给Interceptor必需是true
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("请求之前调用preHandler...2");
//        return false;//false请求终止
        return true;//true请求通过
    }

    @Override
    //请求处理之后调用
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("请求之后调用postHandle...2");
    }

    @Override
    //视图渲染完毕(加载完css,js文件和el表达式)且preHandle返回是true时才会调用
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("渲染完毕调用afterCompletion...2");
    }
}
