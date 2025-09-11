package com.nt.service;

import com.nt.entity.BankAccount;

public interface IBankAccountService {

	public String createNewAccount(BankAccount bankAccount) throws Exception;
	public BankAccount getBankAccount(Long accountNumber) throws Exception;
	public String withdrawMoney(Long accountNumber, Double amount) throws Exception;
	public String depositeMoney(Long accountNumber, Double amount) throws Exception;
}
