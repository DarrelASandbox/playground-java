package com.darrelasandbox._15_aop_demo_refactored.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {

    // @Before("execution(public void addAccount(..))")
    // @Before("execution(public void com.darrelasandbox._15_aop_demo_refactored.dao.AccountDAO.addAccount(..))")
    // @Before("execution(public void add*(..))")
    // @Before("execution(void add*(..))")
    // @Before("execution(* add* (com.darrelasandbox._15_aop_demo_refactored.Account))")
    // @Before("execution(* add* (com.darrelasandbox._15_aop_demo_refactored.Account, ..))")
    // @Before("execution(* add*(..))")
    // @Before("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.*.*(..))")
    @Before("com.darrelasandbox._15_aop_demo_refactored.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method:");
    }
}
