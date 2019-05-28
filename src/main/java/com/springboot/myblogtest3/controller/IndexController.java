package com.springboot.myblogtest3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.myblogtest3.pojo.Blog;
import com.springboot.myblogtest3.service.IBlogService;
import com.springboot.myblogtest3.vo.FullBlog;

@Controller
public class IndexController {
	
	@Autowired
	private IBlogService iBlogService;
	
	@RequestMapping("/index")
	public ModelAndView index() {
		
		List<Blog> list = iBlogService.list();
		List<FullBlog> fullBlogList = new ArrayList<>();
		
		for(Blog blog : list) {
			fullBlogList.add(dealWithBlog(blog));
		}
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		
		mv.addObject("blogList", fullBlogList);
		
		return mv;
	}
	
	@RequestMapping("/")
	public ModelAndView indexTmp() {
		
		List<Blog> list = iBlogService.list();
		List<FullBlog> fullBlogList = new ArrayList<>();
		
		for(Blog blog : list) {
			fullBlogList.add(dealWithBlog(blog));
		}
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		
		mv.addObject("blogList", fullBlogList);
		
		return mv;
	}
	
	
	FullBlog dealWithBlog(Blog blog) {
		FullBlog fullBlog = new FullBlog();
		
		fullBlog.setContent(blog.getContent());
		fullBlog.setId(blog.getId());
		fullBlog.setTitle(blog.getTitle());
		
		String content = blog.getContent();
		String[] strs = content.split("<.*?>");
		String introduction = "";
		for(String str : strs) {
			introduction += str;
		}
		
		if(introduction.length() >= 20) {
			introduction = introduction.substring(0, 20);
		}
		
		fullBlog.setIntroduction(introduction);
		
		return fullBlog;
	}
	
}
