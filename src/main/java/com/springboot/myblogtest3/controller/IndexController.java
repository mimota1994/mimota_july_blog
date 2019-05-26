package com.springboot.myblogtest3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.myblogtest3.pojo.Blog;
import com.springboot.myblogtest3.service.IBlogService;

@Controller
public class IndexController {
	
	@Autowired
	private IBlogService iBlogService;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		List<Blog> list = iBlogService.list();
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		
		mv.addObject("blogList", list);
		
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView indexTmp() {
		
		List<Blog> list = iBlogService.list();
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		
		mv.addObject("blogList", list);
		
		return mv;
	}
	
	
}
