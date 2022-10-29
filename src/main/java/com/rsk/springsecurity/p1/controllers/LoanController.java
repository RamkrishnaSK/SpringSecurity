package com.rsk.springsecurity.p1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsk.springsecurity.p1.model.Loan;
import com.rsk.springsecurity.p1.services.LoanService;

@RestController
@RequestMapping("/loans")
public class LoanController {

	@Autowired
	private LoanService loanService;

	@PostMapping("/")
	public Loan saveLoan(@RequestBody Loan l) {
		return this.loanService.saveLoan(l);
	}

	@GetMapping("/")
	public List<Loan> getAllLoans() {
		return this.loanService.getAllLoans();
	}
 
}
