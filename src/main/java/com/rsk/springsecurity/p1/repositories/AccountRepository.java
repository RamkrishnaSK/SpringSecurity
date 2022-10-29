package com.rsk.springsecurity.p1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsk.springsecurity.p1.model.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
