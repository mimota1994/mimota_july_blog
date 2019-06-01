package com.springboot.myblogtest3.service;

import java.util.List;

import com.springboot.myblogtest3.common.ComResponse;
import com.springboot.myblogtest3.pojo.Blog;

public interface IBlogService {
	
	public ComResponse updateBlog(Blog blog);
	
	public ComResponse get(Integer id);
	
	public ComResponse list();
	
	public ComResponse delete(Integer id);
	
	public ComResponse create(Blog blog);


}
