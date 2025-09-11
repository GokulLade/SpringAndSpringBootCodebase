package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.IBankAccountRepository;

@Service
public class BankAccountService implements IBankAccountService {

	@Autowired
	IBankAccountRepository bankRepo;

	@Override
	public String createNewAccount(BankAccount bankAccount) throws Exception {

		Long accNo = bankRepo.save(bankAccount).getAccountNumber();

		return "Bank Account is Open with Account Number: " + accNo;
	}
	
	
	@Override
	public BankAccount getBankAccount(Long accountNumber) throws Exception {
		
		Optional<BankAccount> accountInfo = bankRepo.findById(accountNumber);
		if(accountInfo.isPresent())
		{
			return accountInfo.get();
		}
		else {
			return accountInfo.orElseThrow(IllegalArgumentException::new);
		}
		
	}

	

	@Override
	public String withdrawMoney(Long accountNumber, Double amount) throws Exception {

		Optional<BankAccount> bankAccount = bankRepo.findById(accountNumber);

		if (bankAccount.isPresent()) {

			BankAccount account = bankAccount.get();
			account.setAccountBalance(account.getAccountBalance() - amount);
			bankRepo.save(account);

			return amount + " money is withdraw from BankAccount";

		} else {
			return accountNumber + " with this number account is not present";
		}

	}

	@Override
	public String depositeMoney(Long accountNumber, Double amount) throws Exception {
		Optional<BankAccount> bankAccount = bankRepo.findById(accountNumber);

		if (bankAccount.isPresent()) {

			BankAccount account = bankAccount.get();
			account.setAccountBalance(account.getAccountBalance() + amount);
			bankRepo.save(account);

			return amount + " money is deposite from BankAccount";

		} else {
			return accountNumber + " with this number account is not present";
		}
	}

}
