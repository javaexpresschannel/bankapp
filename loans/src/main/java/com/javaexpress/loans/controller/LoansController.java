package com.javaexpress.loans.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.loans.models.Loans;
import com.javaexpress.loans.repository.LoansRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/api/v1/loans")
public class LoansController {
	
	@Autowired
	private LoansRepository loansRepository;
	
	@GetMapping("/{customerId}")
	public List<Loans> getLoansDetails(@PathVariable("customerId") int customerId) {
		log.info("getLoansDetails() method started");
		List<Loans> loans = loansRepository.findByCustomerId(customerId);
		if (loans != null) {
			return loans;
		} else {
			return null;
		}
	}
}
