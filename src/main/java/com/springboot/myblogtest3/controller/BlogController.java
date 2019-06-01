package com.springboot.myblogtest3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.myblogtest3.common.ComResponse;
import com.springboot.myblogtest3.pojo.Blog;
import com.springboot.myblogtest3.service.IBlogService;


@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Autowired
	private IBlogService iBlogService;
	
	
	@RequestMapping("/create")
	public ComResponse<Integer> createBlog(Blog blog) {

		return iBlogService.create(blog);

	}
	
	@RequestMapping("/update")
	public ComResponse updateBlog(Blog blog) {
		
		return iBlogService.updateBlog(blog);
		
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
		
		return "success";
	}
	
	@RequestMapping("/edit")
	public ModelAndView editor(Integer id) {
		
		Blog blog = iBlogService.get(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editblog");
		mv.addObject("blog", blog);
		return mv;
		
	}
}
