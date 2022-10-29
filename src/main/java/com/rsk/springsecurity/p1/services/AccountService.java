package com.rsk.springsecurity.p1.services;

import java.util.List;

import com.rsk.springsecurity.p1.model.Account;

public interface AccountService {
	public Account saveAccount(Account acc);
	public List<Account> getAllAccounts();
}	
