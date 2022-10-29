package com.rsk.springsecurity.p1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsk.springsecurity.p1.model.Account;
import com.rsk.springsecurity.p1.services.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@Autowired
	private AccountService accService;

	@PostMapping("/")
	public Account saveAccount(@RequestBody Account acc) {
		return this.accService.saveAccount(acc);
	}

	@GetMapping("/")
	public List<Account> getAllAccounts() {
		return this.accService.getAllAccounts();
	}

}
