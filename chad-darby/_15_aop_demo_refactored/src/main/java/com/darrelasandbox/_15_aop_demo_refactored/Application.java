package com.darrelasandbox._15_aop_demo_refactored;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.darrelasandbox._15_aop_demo_refactored.dao.AccountDAO;
import com.darrelasandbox._15_aop_demo_refactored.dao.MembershipDAO;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		return runner -> {
			// demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
			// demoTheAfterReturningAdvice(theAccountDAO);
			demoTheAfterThrowingAdvice(theAccountDAO);
		};
	}

	private void demoTheAfterThrowingAdvice(AccountDAO theAccountDAO) {
		List<Account> theAccounts = null;
		try {
			boolean tripWire = true;
			theAccounts = theAccountDAO.findAccounts(tripWire);
		} catch (Exception exc) {
			System.out.println("\n\nMain Program: ... caught exception: " + exc);
		}
		System.out.println("\n\nMain Program: demoTheAfterThrowingAdvice");
		System.out.println("----");
		System.out.println(theAccounts);
		System.out.println("\n");
	}

	@SuppressWarnings("unused")
	private void demoTheAfterReturningAdvice(AccountDAO theAccountDAO) {
		List<Account> theAccounts = theAccountDAO.findAccounts();
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("----");
		System.out.println(theAccounts);
		System.out.println("\n");
	}

	@SuppressWarnings("unused")
	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		// call the business method
		Account myAccount = new Account();
		myAccount.setName("Madhu");
		myAccount.setLevel("Platinum");
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.addAccount2(myAccount);
		theAccountDAO.doWork();

		// call the accountdao getter/setter methods
		theAccountDAO.setName("foobar");
		theAccountDAO.setServiceCode("silver");
		@SuppressWarnings("unused")
		String name = theAccountDAO.getName();
		@SuppressWarnings("unused")
		String code = theAccountDAO.getServiceCode();

		// call the membership business method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.addSillyMember2(true);
		theMembershipDAO.goToSleep();

	}

}
