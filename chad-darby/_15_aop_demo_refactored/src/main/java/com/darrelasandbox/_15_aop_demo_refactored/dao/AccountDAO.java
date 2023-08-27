package com.darrelasandbox._15_aop_demo_refactored.dao;

import java.util.List;

import com.darrelasandbox._15_aop_demo_refactored.Account;

public interface AccountDAO {

    List<Account> findAccounts();

    void addAccount(Account theAccount, boolean vipFlag);

    void addAccount2(Account theAccount);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);
}
