package com.springboot.myblogtest3.service;

import java.util.List;

import com.springboot.myblogtest3.pojo.User;
import com.springboot.myblogtest3.util.MyResponse;

public interface IUserService {
	
	MyResponse<User> insertUser(User user);
	
	MyResponse<User> getUser(Long id);

	MyResponse<List<User>> listUser();

}
