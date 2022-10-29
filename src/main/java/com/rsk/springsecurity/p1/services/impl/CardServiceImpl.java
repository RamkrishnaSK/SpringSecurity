package com.rsk.springsecurity.p1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsk.springsecurity.p1.model.Card;
import com.rsk.springsecurity.p1.repositories.CardRepository;
import com.rsk.springsecurity.p1.services.CardService;

@Service
public class CardServiceImpl implements CardService {

	@Autowired
	private CardRepository cardRepo;

	@Override
	public Card saveCard(Card c) {
		return this.cardRepo.save(c);
	}

	@Override
	public List<Card> getAllCards() {
		return this.cardRepo.findAll();
	}

}
