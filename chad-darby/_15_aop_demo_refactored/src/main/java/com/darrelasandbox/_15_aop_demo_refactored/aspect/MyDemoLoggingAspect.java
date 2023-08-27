package com.darrelasandbox._15_aop_demo_refactored.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    // Pointcut declaration
    @Pointcut("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.*.*(..))")
    private void forDaoPackage() {
    }

    @Pointcut("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.*.get*(..))")
    private void getter() {
    }

    @Pointcut("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.*.set*(..))")
    private void setter() {
    }

    // Include package & exclude getter/setter
    // using logic operators
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter() {
    }

    // @Before("execution(public void addAccount(..))")
    // @Before("execution(public void com.darrelasandbox._15_aop_demo_refactored.dao.AccountDAO.addAccount(..))")
    // @Before("execution(public void add*(..))")
    // @Before("execution(void add*(..))")
    // @Before("execution(* add* (com.darrelasandbox._15_aop_demo_refactored.Account))")
    // @Before("execution(* add* (com.darrelasandbox._15_aop_demo_refactored.Account, ..))")
    // @Before("execution(* add*(..))")
    // @Before("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.*.*(..))")
    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method:");
    }

    // Reuse pointcut expression
    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n=====>>> Performing API analytics");
    }
}
