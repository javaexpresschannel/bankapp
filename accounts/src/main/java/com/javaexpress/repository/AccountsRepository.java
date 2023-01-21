package com.javaexpress.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaexpress.model.Account;

public interface AccountsRepository extends JpaRepository<Account, Integer> {

	Optional<Account> findByCustomerId(int customerId);
}
