package com.rsk.springsecurity.p1.services;

import java.util.List;

import com.rsk.springsecurity.p1.model.Card;

public interface CardService {
	public Card saveCard(Card c);

	public List<Card> getAllCards();
}
