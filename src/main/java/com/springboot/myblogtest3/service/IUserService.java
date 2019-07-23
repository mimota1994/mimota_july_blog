package com.springboot.myblogtest3.service;

import java.util.List;

import com.springboot.myblogtest3.pojo.User;
import com.springboot.myblogtest3.util.MyResponse;

public interface IUserService {
	
	public MyResponse insertUser(User user);
	
	public MyResponse getUser(Long id);

	public MyResponse listUser();

	public MyResponse deleteUser(int id);

}
