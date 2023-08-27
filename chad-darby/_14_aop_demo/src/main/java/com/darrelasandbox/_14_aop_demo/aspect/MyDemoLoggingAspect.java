package com.darrelasandbox._14_aop_demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // @Before("execution(public void addAccount(..))")
    // @Before("execution(public void com.darrelasandbox._14_aop_demo.dao.AccountDAO.addAccount(..))")
    // @Before("execution(public void add*(..))")
    // @Before("execution(void add*(..))")
    // @Before("execution(* add* (com.darrelasandbox._14_aop_demo.Account))")
    // @Before("execution(* add* (com.darrelasandbox._14_aop_demo.Account, ..))")
    // @Before("execution(* add*(..))")
    @Before("execution(* com.darrelasandbox._14_aop_demo.dao.*.*(..))")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method:");
    }
}
