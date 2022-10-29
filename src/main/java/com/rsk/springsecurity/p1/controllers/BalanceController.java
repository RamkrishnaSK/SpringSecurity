package com.rsk.springsecurity.p1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsk.springsecurity.p1.model.Balance;
import com.rsk.springsecurity.p1.services.BalanceService;

@RestController
@RequestMapping("/balance")
public class BalanceController {

	@Autowired
	private BalanceService balService;

	@PostMapping("/")
	public Balance saveBalance(@RequestBody Balance bal) {
		return this.balService.saveBalance(bal);
	}

	@GetMapping("/")
	public List<Balance> getAllBal() {
		return this.balService.listAllbal();
	}

}
