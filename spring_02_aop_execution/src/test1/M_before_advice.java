package test1;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

//继承MethodBeforeAdvice -->前置通知
public class M_before_advice implements MethodBeforeAdvice {

    //所有的前置内容,织入到切入点
    @Override
    //target指的是调用该方法的对象,method指的是pointcut所在的方法,arg参数
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("MethodBeforeAdvice...");
        System.out.println("调用的对象" + target + "调用对象的方法名" + method.getName() + "调用的参数" + args.length);

    }


}
