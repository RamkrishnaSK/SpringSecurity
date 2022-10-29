package com.rsk.springsecurity.p1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsk.springsecurity.p1.model.Notice;
import com.rsk.springsecurity.p1.services.NoticeService;

@RestController
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;

	@PostMapping("/")
	public Notice saveNotice(@RequestBody Notice n) {
		return this.noticeService.saveNotice(n);
	}

	@GetMapping("/")
	public List<Notice> getAllNotices() {
		return this.noticeService.getAllNotices();
	}

}
