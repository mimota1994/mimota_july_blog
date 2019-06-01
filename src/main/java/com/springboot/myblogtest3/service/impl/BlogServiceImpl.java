package com.springboot.myblogtest3.service.impl;

import java.util.List;

import com.springboot.myblogtest3.common.ResponseStatus;
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
	
	public ComResponse updateBlog(Blog blog) {
		
		int result = iBlogDao.update(blog);

		if(result > 0) {
			return new ComResponse(ResponseStatus.CORRECT.code, ResponseStatus.CORRECT.msg);
		}else {

			return new ComResponse(ResponseStatus.UPDATE_BLOG_ERROR.code, ResponseStatus.UPDATE_BLOG_ERROR.msg);
		}
		
	}

	@Override
	public ComResponse get(Integer id) {

		Blog blog = iBlogDao.get(id);
		if(blog == null){
			return new ComResponse(ResponseStatus.NO_SUCH_BLOG.code, ResponseStatus.NO_SUCH_BLOG.msg);
		}
		return new ComResponse(ResponseStatus.CORRECT.code, ResponseStatus.CORRECT.msg, blog);
	}

	@Override
	public ComResponse list() {
		List<Blog> list = iBlogDao.list();

		return new ComResponse(ResponseStatus.CORRECT.code, ResponseStatus.CORRECT.msg, list);
	}

	@Override
	public ComResponse delete(Integer id) {
		int result = iBlogDao.delete(id);

		if(result > 0){
			return new ComResponse(ResponseStatus.CORRECT.code, ResponseStatus.CORRECT.msg);
		}
		return new ComResponse(ResponseStatus.DELETE_BLOG_ERROR.code, ResponseStatus.DELETE_BLOG_ERROR.msg);
	}

	@Override
	public ComResponse create(Blog blog) {
		int result = iBlogDao.create(blog);
		if(result > 0) {
			return new ComResponse(ResponseStatus.CORRECT.code, ResponseStatus.CORRECT.msg, blog.getId());
		}else {
			return new ComResponse(ResponseStatus.CREATE_BLOG_ERROR.code, ResponseStatus.CREATE_BLOG_ERROR.msg);

		}
	}
}
