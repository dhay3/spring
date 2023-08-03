package advice_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

//需要将该类注入到ioc中才会生效
@Aspect//添加@Aspect注解表示当前类aspect所在类
public class AnnotationTest {
    //采用注解形式自动注入式必须的<aop:aspectj-autoproxy/>
    //前置通知
    //在执行execution中指定的方法之前执行该方法
    @Before("execution( * test.*.mainFunction(..))")//织入advice到pointcut
    public void myBefore(JoinPoint jp) {//如果注解形式中需要拿到目标对象的参数 advice的参数必须是JoinPoint
        System.out.println("获取目标对象" + jp.getTarget());
        Signature signature = jp.getSignature();
        System.out.println("获取目标对象的pointcut所在的方法" + jp.getSignature());
        System.out.println("方法的参数" + Arrays.toString(jp.getArgs()));
        System.out.println("myBefore...annotation");
    }

    //后置通知
    @AfterReturning(
            pointcut = "execution(* test.MainTest.mainFunction(..))",
            //对的是参数中的值,告诉spring要捕捉返回值到returning中
            returning = "returningValue")//添加返回值注释
    public void myAfter(JoinPoint jp, Object returningValue) {//如果需要获取目标函数有返回值需要添加注释
        System.out.println(returningValue);
        System.out.println("myAfter...annotation");
    }

    //异常通知
    @AfterThrowing(
            pointcut = "execution(* test..*.mainFunctionException(..))"
            ,throwing = "e")
    //添加参数指定异常,只捕捉指定异常,在指定异常前的异常不会调用该方法
    public void myThrows(JoinPoint joinPoint,NumberFormatException e) {
        System.out.println(e.getMessage());
        System.out.println("ThrowsAdvice");
    }

    //最终通知
    @After("execution(* mainFunction(..))")//相当于finally在return之前执行
    public void myAfter() {
        System.out.println("After...");
    }

    //环绕通知
    @Around("execution(* test..*.mainFunctionAround(..))")
    //如果是环绕通知要用JoinPoint下级接口ProceedingJoinPoint获取对象目标参数
    public Object myAround(ProceedingJoinPoint joinPoint) {
        try {
            //前置通知
            System.out.println("MethodBeforeAdvice");
            Object result = joinPoint.proceed();
            //后置通知
            System.out.println("AfterReturning");
            System.out.println("返回值" + result);
            System.out.println("函数名" + joinPoint.getSignature().getName());
            System.out.println("参数个数" + joinPoint.getArgs().length);
            System.out.println("被代理对象"+joinPoint.getSignature().getClass());
            System.out.println("被代理对象"+joinPoint.getTarget());
        } catch (Throwable throwable) {//采用上级实例
            //异常通知
            System.out.println("ThrowsAdvice");
            throwable.printStackTrace();
        } finally {
            //最终通知
            System.out.println("最终通知");
        }
        //代理的函数结果会被around的放回值替代
        return 1;//参数必须和目标函数相同()
    }


}
