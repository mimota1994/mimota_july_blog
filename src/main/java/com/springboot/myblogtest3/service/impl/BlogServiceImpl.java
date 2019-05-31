package com.springboot.myblogtest3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.myblogtest3.common.ComResponse;
import com.springboot.myblogtest3.dao.IBlogDao;
import com.springboot.myblogtest3.pojo.Blog;
import com.springboot.myblogtest3.service.IBlogService;

@Service
public class BlogServiceImpl implements IBlogService{
	
	@Autowired
	private IBlogDao iBlogDao = null;
	
	public void updateBlog(Blog blog) {
		
		int result = iBlogDao.update(blog);
		
		ComResponse<Integer> response = new ComResponse<Integer>();
		if(result > 0) {
			response.code = 0;
			response.msg = "create blog successfully";
			response.data = blog.getId();
			return response;
		}else {
			response.code = 1;
			response.msg = "db error";
			return response;
		}
		
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

	@Override
	public void delete(Integer id) {
		iBlogDao.delete(id);
		
	}

	@Override
	public ComResponse<Integer> create(Blog blog) {
		int result = iBlogDao.create(blog);
		ComResponse<Integer> response = new ComResponse<Integer>();
		if(result > 0) {
			response.code = 0;
			response.msg = "create blog successfully";
			response.data = blog.getId();
			return response;
		}else {
			response.code = 1;
			response.msg = "db error";
			return response;
		}
	}
}
