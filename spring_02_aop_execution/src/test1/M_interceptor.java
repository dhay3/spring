package test1;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//MethodInterceptor -->环绕通知(前后异常)可以用MethodInterceptor实现前后异常的advice
public class M_interceptor implements MethodInterceptor {
    /**
     * @param invocation invocation.getArguments() 获取参数
     *                   invocation.getThis() 获取执行目标方法的this
     *                   result=invocation.proceed()返回值
     */
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        //底层反射
        Object result = null;
        try {
            //在invocation.proceed()之前就是前置通知
            System.out.println("执行目标方法之前" + invocation.getMethod().getName());
            //如果不执行invocation.proceed()就不执行目标方法,用invoke方法替代执行
            //如果目标函数是返回值是void result就为null,invoke方法的返回值是void
            result = invocation.proceed();//相当于执行目标对象方法,返回值也是目标对象方法的返回值
            //在invocation.proceed()之后就是后置通知
            System.out.println("目标方法返回值" + result);
            System.out.println("执行目标方法之后" + invocation.getMethod().getReturnType());
        } catch (Throwable throwable) {
            System.out.println("异常通知");
            throwable.printStackTrace();
        }
//        return result;
        return "fuck u";
        /*目标方法的return的值可以被改变,但是invoke中的返回值必须与目标函数一样,目标函数没有返回值是不管invoke返回值是什么都为void
        *但是如果有MethodBeforeAdvice,AfterReturningAdvice,ThrowsAdvice时
         他们的方法中的返回值为invoke的返回值*/
    }
}
