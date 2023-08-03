package test1;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

//继承AfterReturningAdvice -->后置通知
public class A_returning_advice implements AfterReturningAdvice {
    @Override
    //returnValue指的是方法的返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("afterReturningAdvice...");
        System.out.println("方法返回值" + returnValue);
    }
}
