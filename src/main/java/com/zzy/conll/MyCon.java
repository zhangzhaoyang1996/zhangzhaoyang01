package com.zzy.conll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zzy.bean.Use;
import com.zzy.service.UseService;

@Controller
public class MyCon {
	
	@Autowired
	private UseService service;
	@RequestMapping("add")
	public String add(Use use) {
		System.out.println(use);
		service.add(use);
		return "redirect:list";
	}
	
	@RequestMapping("list")
	public String list(Model mod) {
		List<Use> list = service.list();
		mod.addAttribute("list",list);
		return "list";
	}
	

}
