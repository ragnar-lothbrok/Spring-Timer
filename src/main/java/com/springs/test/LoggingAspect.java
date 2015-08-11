package com.springs.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

//    @Before("execution(* com.springs.test.ManagerI.*())")
//    public void getAdvice(JoinPoint joinPoint) {
//        System.out.println("@Before..."+joinPoint.getTarget());
//    }
//
//    @AfterReturning(  
//            pointcut = "execution(* com.springs.test.ManagerI.*())",  
//            returning= "result")  
//    public void getAdvice1(JoinPoint joinPoint,Object result) {
//        System.out.println("@AfterReturning..."+joinPoint.getTarget()+" "+result);
//    }
//
//    @Around("execution(* com.springs.test.ManagerI.*())")
//    public void getAdvice3(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("@Around...b4");
//        pjp.proceed();
//        System.out.println("@Around...after");
//    }
//
//    @After("execution(* com.springs.test.ManagerI.*())")
//    public void getAdvice4() {
//        System.out.println("@After...");
//    }
//    
//    @AfterThrowing(pointcut="execution(* com.springs.test.ManagerI.*())",throwing="ex")
//    public void getAdvice5(Exception ex) {
//        System.out.println("@@AfterThrowing..."+ex.getMessage());
//    }

}
