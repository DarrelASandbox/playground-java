package com.darrelasandbox._15_aop_demo_refactored.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.darrelasandbox._15_aop_demo_refactored.Account;

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
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {
        System.out.println("\n=====>>> Executing @Before advice on method:");

        // Display the method signature
        MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
        System.out.println("Method: " + methodSignature);

        // Display method arguments & get args
        Object[] args = theJoinPoint.getArgs();

        // Loop through args
        for (Object tempArg : args) {
            System.out.println(tempArg);

            if (tempArg instanceof Account) {
                // Downcast and print `Account` specific stuff
                Account theAccount = (Account) tempArg;
                System.out.println("Account Name: " + theAccount.getName());
                System.out.println("Account Level: " + theAccount.getLevel());
            }
        }
    }
}
