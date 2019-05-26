package com.springboot.myblogtest3.service.impl;

import java.util.List;

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
	public Blog get(Integer id) {
		Blog blog = iBlogDao.get(id);
		return blog;
	}

	@Override
	public List<Blog> list() {
		List<Blog> list = iBlogDao.list();
		
		return list;
	}
}
