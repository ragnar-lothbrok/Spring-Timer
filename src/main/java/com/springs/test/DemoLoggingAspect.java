package com.springs.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DemoLoggingAspect {

    @Before("printData1()")
    public void getAdvice(JoinPoint joinPoint) {
        System.out.println("@Before[Using Pointcut]..." + joinPoint.getTarget());
        if (joinPoint.getArgs().length > 0) {
            System.out.println("===" + joinPoint.getArgs()[0]);
            joinPoint.getArgs()[0] = "lol";
            System.out.println("===" + joinPoint.getArgs()[0]);
        }
    }
    
    @Before("execution(* com..*(..)) && args(object,..)")
    public void getAdvice1(JoinPoint joinPoint,String object) {
        System.out.println("@Before[Using getAdvice1]..." + joinPoint.getTarget()+" "+object);
    }

    @Pointcut("execution(*  com.springs.test.ManagerI..*(..))")
    public void printData() {
    }

    @Pointcut("within(com.springs.test..*)")
    public void printData1() {
    }

}
