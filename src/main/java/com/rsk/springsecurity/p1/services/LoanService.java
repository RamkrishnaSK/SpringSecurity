package com.rsk.springsecurity.p1.services;

import java.util.List;

import com.rsk.springsecurity.p1.model.Loan;

public interface LoanService {
	public Loan saveLoan(Loan l);

	public List<Loan> getAllLoans();
}
