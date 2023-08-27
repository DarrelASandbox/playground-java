package com.darrelasandbox._15_aop_demo_refactored.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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

    @After("execution(* com.darrelasandbox._15_aop_demo_refactored.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @After (finally) on method: " + method);
    }

    @AfterThrowing(pointcut = "execution(* com.darrelasandbox._15_aop_demo_refactored.dao.AccountDAO.findAccounts(..))", throwing = "theExc")
    public void afterThrowingFindAccountsAdvice(
            JoinPoint theJoinPoint, Throwable theExc) {
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @AfterThrowing on method: " + method);
        System.out.println("\n=====>>> The exception is: " + theExc);
    }

    @AfterReturning(pointcut = "execution(* com.darrelasandbox._15_aop_demo_refactored.dao.AccountDAO.findAccounts(..))", returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> result) {
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
        System.out.println("\n=====>>> result is: " + result);
        convertAccountNamesToUpperCase(result);
        System.out.println("\n=====>>> result is: " + result);
    }

    private void convertAccountNamesToUpperCase(List<Account> result) {
        for (Account tempAccount : result) {
            String theUpperName = tempAccount.getName().toUpperCase();
            tempAccount.setName(theUpperName);
        }
    }

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
