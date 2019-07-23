package com.springboot.myblogtest3.service.impl;

import java.util.List;

import com.springboot.myblogtest3.util.common.Message;
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
		if(row > 0) {
			return MyResponse.createSuccessByDataAndMessage(Message.ADD_USER_SUCCESS, user);
		}else {
			return MyResponse.createFailureByMsg(Message.DATASTORE_FAILURE);
		}
	}
	
	@Override
	public MyResponse<User> getUser(Long id) {
		User user = iUserDao.getUser(id);
		if(user != null) {
			return MyResponse.createSuccessByDataAndMessage(Message.GET_USER_SUCCESS, user);
		}else {
			return MyResponse.createFailure();

		}
	}

	@Override
	public MyResponse<List<User>> listUser() {
		List<User> users = iUserDao.listUser();
		return MyResponse.createSuccessByDataAndMessage(Message.SEARCH_USER_SUCCESS, users);
	}

	@Override
	public MyResponse createNewTable() {
		try{
			iUserDao.createNewTable("t_user");
			return MyResponse.createSuccess();
		}catch (Exception e){
			return MyResponse.createFailure();
		}
	}
}
