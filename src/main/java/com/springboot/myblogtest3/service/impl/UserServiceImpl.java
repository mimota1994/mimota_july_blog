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
	public MyResponse insertUser(User user) {
		// TODO Auto-generated method stub
		
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
	public User getUser(Long id) {
		
		return iUserDao.getUser(id);
	}

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return iUserDao.listUser();
	}

}
