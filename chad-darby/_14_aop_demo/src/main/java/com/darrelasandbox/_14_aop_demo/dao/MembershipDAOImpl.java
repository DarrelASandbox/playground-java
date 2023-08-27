package com.darrelasandbox._14_aop_demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO {

    @Override
    public boolean addSillyMember() {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING A MEMBERSHIP ACCOUNT");
        return true;
    }

    @Override
    public void addSillyMember2(boolean admin) {
        System.out.println(getClass() + ": addSillyMember2 has argument of admin = " + admin + ".");
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass() + ": I'm going to sleep now...");
    }

}
