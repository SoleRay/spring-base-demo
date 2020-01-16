package com.demo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

//@Aspect
//@Configuration
public class AspectAnnExpose {


    @Pointcut(value = "execution(* com.demo.bean.common.annotation.circulation.AnnExposeA.*(..))")
    public void expose(){};

    @Before("expose()")
    public void before() {
        System.out.println("ssss");
    }

}
