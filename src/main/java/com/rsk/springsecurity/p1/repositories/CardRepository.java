package com.rsk.springsecurity.p1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsk.springsecurity.p1.model.Card;

public interface CardRepository extends JpaRepository<Card, Integer> {

}
