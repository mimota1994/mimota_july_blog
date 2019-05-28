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
	private IBlogService iBlogService;
	
	
	@RequestMapping("/create")
	public String createBlog() {
		
		return "createBlog";
		
	}
	
	@RequestMapping("/upload")
	public String upLoadBlog(String title, String content) {
		
		iBlogService.uploadBlog(title, content);
		System.out.println("insert successfully");
		return "createBlogsuccess";
		
	}
	
	@RequestMapping("/get")
	public ModelAndView getBlog(Integer id) {
		Blog blog = iBlogService.get(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Blogdetail");
		mv.addObject("blog", blog);
		return mv;
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) {
		iBlogService.delete(id);
		
		return "createBlogsuccess";
	}
	
	@RequestMapping("/edit")
	public String editor(Integer id) {
		
		return "editblog";
	}
}
