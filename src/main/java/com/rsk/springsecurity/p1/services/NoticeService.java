package com.rsk.springsecurity.p1.services;

import java.util.List;

import com.rsk.springsecurity.p1.model.Notice;

public interface NoticeService {
	public Notice saveNotice(Notice n);

	public List<Notice> getAllNotices();
}
