package com.demo.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;


//@Aspect
//@Configuration
public class AspectAdviceBeanAutowire {


	@Pointcut(value = "execution(* com.demo..*(..))")
	public void all(){};

	@Pointcut(value = "execution(* com.demo.service.demo..add*(..))")
	public void services(){};

	@Pointcut(value = "execution(* com.demo.service.demo..do*(..))")
	public void doMethods(){};

	@Before("all()")
	public void before1() {
		System.out.println("----------- AspectAdviceBean before1 增强 ");
	}

	@Before("doMethods()")
	public void before2(JoinPoint jp) {
		System.out.println("----------- AspectAdviceBean before2 增强 for " + jp);
	}

	@Before("execution(* com.demo.service.demo..add*(..)) && args(tk)")
	public void before3(String tk) {
		System.out.println("----------- AspectAdviceBean before3  增强  参数tk= " + tk);
	}

	@Before("execution(* com.demo.service.demo..add*(..)) && args(tk,ti)")
	public void before4(String tk, int ti) {
		System.out.println("----------- AspectAdviceBean before4  增强  参数tk= " + tk + " ti=" + ti);
	}
	@Around("services()")
	public Object arround1(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("----------- AspectAdviceBean arround1 环绕-前增强 for " + pjp);
		Object ret = pjp.proceed();
		System.out.println("----------- AspectAdviceBean arround1 环绕-后增强 for " + pjp);
		return ret;
	}

	@Around("execution(* com.demo.service.demo..add*(..)) && args(name)")
	public Object arround2(ProceedingJoinPoint pjp, String name) throws Throwable {
		System.out.println("--------- AspectAdviceBean arround2 参数 name=" + name);
		System.out.println("----------- AspectAdviceBean arround2 环绕-前增强 for " + pjp);
		Object ret = pjp.proceed();
		System.out.println("----------- AspectAdviceBean arround2 环绕-后增强 for " + pjp);
		return ret;
	}

	@AfterReturning(pointcut = "services()",returning = "retValue")
	public void afterReturning(Object retValue) {
		System.out.println("----------- AspectAdviceBean afterReturning 增强 , 返回值为： " + retValue);
	}

	@AfterThrowing(pointcut = "services()",throwing = "e")
	public void afterThrowing(JoinPoint jp, Exception e) {
		System.out.println("----------- AspectAdviceBean afterThrowing 增强  for " + jp);
		System.out.println("----------- AspectAdviceBean afterThrowing 增强  异常 ：" + e);
	}

	@After("services()")
	public void after(JoinPoint jp) {
		System.out.println("----------- AspectAdviceBean after 增强  for " + jp);
	}

}
