package com.demo.aop.around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("do sth before....");
        Object retVal = invocation.proceed();
        System.out.println("do sth after....");
        return retVal;
    }
}
