package com.springboot.myblogtest3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.myblogtest3.dao.IUserDao;
import com.springboot.myblogtest3.pojo.User;
import com.springboot.myblogtest3.service.IUserService;
import com.springboot.myblogtest3.util.MyResponse;


@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao iUserDao = null;
	
	
	@Override
	public MyResponse<User> insertUser(User user) {
		int row = iUserDao.insertUser(user);
		MyResponse response = new MyResponse();
		response.data = user;
		if(row > 0) {
			response.msg = "success";
			response.status = 1;
			return response;
		}else {
			response.msg = "failure";
			response.status = 199;
		}
		return response;
	}
	
	@Override
	public MyResponse<User> getUser(Long id) {
		User user = iUserDao.getUser(id);
		MyResponse response = new MyResponse();
		response.data = user;
		if(user != null) {
			response.msg = "success";
			response.status = 1;
			return response;
		}else {
			response.msg = "failure";
			response.status = 199;
		}
		return response;
	}

	@Override
	public MyResponse<List<User>> listUser() {
		List<User> users = iUserDao.listUser();
		MyResponse response = new MyResponse();
		response.data = users;
		response.msg = "success";
		response.status = 1;
		return response;
	}
}
