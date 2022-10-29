package com.rsk.springsecurity.p1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsk.springsecurity.p1.model.Notice;
import com.rsk.springsecurity.p1.repositories.NoticeRepository;
import com.rsk.springsecurity.p1.services.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeRepository noticeRepo;

	@Override
	public Notice saveNotice(Notice n) {
		return this.noticeRepo.save(n);
	}

	@Override
	public List<Notice> getAllNotices() {
		return this.noticeRepo.findAll(); 
	}

}
