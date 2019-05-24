package com.springboot.myblogtest3.service;

import com.springboot.myblogtest3.pojo.Blog;

public interface IBlogService {
	
	public void uploadBlog(String content);
	
	public String get(Integer id);

}
