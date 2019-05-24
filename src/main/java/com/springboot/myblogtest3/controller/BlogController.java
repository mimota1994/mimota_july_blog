package com.springboot.myblogtest3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.myblogtest3.service.IBlogService;


@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private IBlogService IBlogService;
	
	
	@RequestMapping("/create")
	public String createBlog() {
		
		return "createBlog";
		
	}
	
	@RequestMapping("/upload")
	public String upLoadBlog(String content) {
		
		IBlogService.uploadBlog(content);
		System.out.println("insert successfully");
		return "index";
		
	}
	
	@RequestMapping("/get")
	public String getBlog(Integer id) {
		
		String content = IBlogService.get(id);
		System.out.println("insert successfully");
		return "index";
		
	}
	
	
}
