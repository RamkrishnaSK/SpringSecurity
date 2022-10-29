package com.rsk.springsecurity.p1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsk.springsecurity.p1.model.Card;
import com.rsk.springsecurity.p1.services.CardService;

@RestController
@RequestMapping("/cards")
public class CardController {

	@Autowired
	private CardService cardService;

	@PostMapping("/")
	public Card saveCard(@RequestBody Card c) {
		return this.cardService.saveCard(c);
	}

	@GetMapping("/")
	public List<Card> getAllCards() {
		return this.cardService.getAllCards();
	}

}
