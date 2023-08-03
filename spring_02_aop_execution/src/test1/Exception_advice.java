package test1;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;
//继承ThrowAdvice -->异常通知
public class Exception_advice implements ThrowsAdvice {
    //实现异常通知必须要包含方法afterThrowing(具体看源码,源码中的[]表示要不全有要不全没有)
    public void afterThrowing(Method method, Object[] args, Object target, Throwable e) {
        //调用的对象是方法所在的对象
        System.out.println("调用的对象" + target + "调用对象的方法名" + method.getName()
                + "调用的参数" + args.length + "异常" + e.getMessage());
    }
}
