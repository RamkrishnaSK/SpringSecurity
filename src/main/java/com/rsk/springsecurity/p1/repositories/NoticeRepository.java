package com.rsk.springsecurity.p1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rsk.springsecurity.p1.model.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Integer> {

}
