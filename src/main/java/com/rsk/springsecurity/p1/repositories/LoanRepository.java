package com.rsk.springsecurity.p1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsk.springsecurity.p1.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

}
