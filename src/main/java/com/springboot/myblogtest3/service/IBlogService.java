package com.springboot.myblogtest3.service;

import java.util.List;

import com.springboot.myblogtest3.pojo.Blog;

public interface IBlogService {
	
	public void uploadBlog(String content);
	
	public Blog get(Integer id);
	
	public List<Blog> list();

}
