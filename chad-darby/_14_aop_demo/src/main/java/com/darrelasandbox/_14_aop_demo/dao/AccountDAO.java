package com.darrelasandbox._14_aop_demo.dao;

import com.darrelasandbox._14_aop_demo.Account;

public interface AccountDAO {

    void addAccount(Account theAccount, boolean vipFlag);

    void addAccount2(Account theAccount);

    boolean doWork();

    public String getName();

    public void setName(String name);

    public String getServiceCode();

    public void setServiceCode(String serviceCode);
}
