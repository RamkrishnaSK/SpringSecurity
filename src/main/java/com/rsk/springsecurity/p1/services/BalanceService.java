package com.rsk.springsecurity.p1.services;

import java.util.List;

import com.rsk.springsecurity.p1.model.Balance;

public interface BalanceService {
	public Balance saveBalance(Balance b);

	public List<Balance> listAllbal();
}
