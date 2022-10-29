package com.rsk.springsecurity.p1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsk.springsecurity.p1.model.Account;
import com.rsk.springsecurity.p1.repositories.AccountRepository;
import com.rsk.springsecurity.p1.services.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accRepo;

	@Override
	public Account saveAccount(Account acc) {
		return this.accRepo.save(acc);
	}

	@Override
	public List<Account> getAllAccounts() {
		return this.accRepo.findAll();
	}

}
