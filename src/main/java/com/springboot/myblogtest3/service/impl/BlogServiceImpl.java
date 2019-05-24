package com.springboot.myblogtest3.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.myblogtest3.dao.IBlogDao;
import com.springboot.myblogtest3.pojo.Blog;
import com.springboot.myblogtest3.service.IBlogService;

@Service
public class BlogServiceImpl implements IBlogService{
	
	@Autowired
	private IBlogDao iBlogDao = null;
	
	public void uploadBlog(String content) {
		Blog blog = new Blog();
		
		blog.setContent(content);
		blog.setTitle("titile for every thing");
		
		iBlogDao.insert(blog);
	}

	@Override
	public String get(Integer id) {
		String content = iBlogDao.get(id);
		return content;
	}
}
