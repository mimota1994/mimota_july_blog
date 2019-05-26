package com.springboot.myblogtest3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.myblogtest3.pojo.Blog;
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
		return "createBlogsuccess";
		
	}
	
	@RequestMapping("/get")
	public ModelAndView getBlog(Integer id) {
		Blog blog = IBlogService.get(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Blogdetail");
		mv.addObject("blog", blog);
		return mv;
	}
}
