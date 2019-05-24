package com.springboot.myblogtest3.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.myblogtest3.pojo.User;

@Repository
public interface IUserDao {
	public int insertUser(User user);
	
	public User getUser(Long id);
	
	public List<User> listUser();
}
