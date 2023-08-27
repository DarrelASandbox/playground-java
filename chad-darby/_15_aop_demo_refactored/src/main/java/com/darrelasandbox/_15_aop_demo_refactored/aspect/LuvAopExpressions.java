package com.darrelasandbox._15_aop_demo_refactored.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LuvAopExpressions {

    // Pointcut declaration
    @Pointcut("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Pointcut("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.*.get*(..))")
    public void getter() {
    }

    @Pointcut("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.*.set*(..))")
    public void setter() {
    }

    // Include package & exclude getter/setter
    // using logic operators
    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {
    }
}
