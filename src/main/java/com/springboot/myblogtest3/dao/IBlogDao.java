package com.springboot.myblogtest3.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.myblogtest3.pojo.Blog;

@Repository
public interface IBlogDao {
	
	public void insert(Blog blog);

	public Blog get(Integer id);
	
	public List<Blog> list();
	
	public void delete(Integer id);
	
}
