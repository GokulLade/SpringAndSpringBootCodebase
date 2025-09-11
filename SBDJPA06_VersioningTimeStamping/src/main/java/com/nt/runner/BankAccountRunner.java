package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccount;
import com.nt.service.IBankAccountService;
@Component
public class BankAccountRunner implements CommandLineRunner {

	@Autowired
	IBankAccountService bankService;

	@Override
	public void run(String... args) throws Exception {

		try {

//			BankAccount newAccount = new BankAccount("Ram", 30000.0, "SBI", "Saving");
//			System.out.println(bankService.createNewAccount(newAccount));
			
//			System.out.println(bankService.withdrawMoney(10001L, 10000.0));
//			System.out.println(bankService.depositeMoney(10000L, 27000.0));
			
			System.out.println(bankService.getBankAccount(10000L));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
