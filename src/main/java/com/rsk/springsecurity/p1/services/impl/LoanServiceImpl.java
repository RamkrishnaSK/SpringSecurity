package com.rsk.springsecurity.p1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsk.springsecurity.p1.model.Loan;
import com.rsk.springsecurity.p1.repositories.LoanRepository;
import com.rsk.springsecurity.p1.services.LoanService;

@Service
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanRepository loanRepo;

	@Override
	public Loan saveLoan(Loan l) {
		return this.loanRepo.save(l);
	}

	@Override
	public List<Loan> getAllLoans() {
		return this.loanRepo.findAll();
	}

}
