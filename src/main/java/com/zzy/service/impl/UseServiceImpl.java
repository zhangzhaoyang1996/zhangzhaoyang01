package com.zzy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzy.bean.Use;
import com.zzy.dao.UseDao;
import com.zzy.service.UseService;
@Service
public class UseServiceImpl implements UseService{
	
	@Autowired
	private UseDao dao;

	public void add(Use use) {
		System.out.println("111111");
		dao.add(use);
		
	}

	public List<Use> list() {
		return dao.list();
	}
	
	

}
