package test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
//schema和annotation一样通过JoinPoint和ProceedingJoinPoint拿值`
public class SchemaTest {
    public void before() {
        System.out.println("before...");
    }

    public void afterReturning(Object returning) {
        System.out.println("afterReturning...");
        System.out.println("returningValue-->"+returning);
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("after...");
        System.out.println("methodName-->"+joinPoint.getSignature().getName());
    }
    public void throwsE(NumberFormatException e){//只捕捉指定异常,在指定异常前的异常不会调用该方法
        System.out.println("exception");
        System.out.println(e.getMessage());
    }
    public int round(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("before...");
            Object proceed = joinPoint.proceed();
            System.out.println(proceed);
            System.out.println("after...");
        } catch (Throwable throwable) {
            System.out.println("exception");
            throwable.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        return 1000;
    }
}
