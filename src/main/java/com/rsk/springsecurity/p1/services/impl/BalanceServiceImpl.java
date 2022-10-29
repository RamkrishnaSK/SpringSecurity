package com.rsk.springsecurity.p1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsk.springsecurity.p1.model.Balance;
import com.rsk.springsecurity.p1.repositories.BalanceRepository;
import com.rsk.springsecurity.p1.services.BalanceService;

@Service
public class BalanceServiceImpl implements BalanceService {

	@Autowired
	private BalanceRepository balRepo;

	@Override
	public Balance saveBalance(Balance b) {
		return this.balRepo.save(b);
	}

	@Override
	public List<Balance> listAllbal() {
		return this.balRepo.findAll();
	}

}
