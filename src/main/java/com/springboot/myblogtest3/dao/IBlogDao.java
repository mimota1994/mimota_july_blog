package com.springboot.myblogtest3.dao;

import org.springframework.stereotype.Repository;

import com.springboot.myblogtest3.pojo.Blog;

@Repository
public interface IBlogDao {
	
	public void insert(Blog blog);

	public String get(Integer id);
}
