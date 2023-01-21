/**
 * 
 */
package com.javaexpress.cards.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.cards.model.Cards;
import com.javaexpress.cards.repository.CardsRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/cards")
public class CardsController {

	private CardsRepository cardsRepository;
	
	@GetMapping("/{customerId}")
	public List<Cards> getCardDetails(@PathVariable("customerId") int customerId) {
		log.info("getCardDetails() method started in Cards Microservice {} ");
		List<Cards> cards = cardsRepository.findByCustomerId(customerId);
		if (cards != null) {
			return cards;
		}
		return null;
	}
}
