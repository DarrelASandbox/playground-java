package com.darrelasandbox._14_aop_demo.dao;

import org.springframework.stereotype.Repository;

import com.darrelasandbox._14_aop_demo.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

    private String name;
    private String serviceCode;

    @Override
    public void addAccount(Account theAccount, boolean vipFlag) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");

    }

    @Override
    public void addAccount2(Account theAccount) {
        System.out.println(getClass() + ": Specifically for param with `myAccount` only");

    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + ": doWork()");
        return false;
    }

    public String getName() {
        System.out.println(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + ": in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + ": in setServiceCode()");
        this.serviceCode = serviceCode;
    }
}
