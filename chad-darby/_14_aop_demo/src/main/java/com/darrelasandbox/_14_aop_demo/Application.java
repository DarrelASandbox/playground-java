package com.darrelasandbox._14_aop_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.darrelasandbox._14_aop_demo.dao.AccountDAO;
import com.darrelasandbox._14_aop_demo.dao.MembershipDAO;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		return runner -> {
			demoTheBeforeAdvice(theAccountDAO, theMembershipDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO) {

		// call the business method
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.addAccount2(myAccount);
		theAccountDAO.doWork();

		// call the membership business method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.addSillyMember2(true);
		theMembershipDAO.goToSleep();

	}

}
