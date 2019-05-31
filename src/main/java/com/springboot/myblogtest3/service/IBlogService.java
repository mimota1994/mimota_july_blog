package com.springboot.myblogtest3.service;

import java.util.List;

import com.springboot.myblogtest3.common.ComResponse;
import com.springboot.myblogtest3.pojo.Blog;

public interface IBlogService {
	
	public void updateBlog(Blog blog);
	
	public Blog get(Integer id);
	
	public List<Blog> list();
	
	public void delete(Integer id);
	
	public ComResponse<Integer> create(Blog blog);


}
