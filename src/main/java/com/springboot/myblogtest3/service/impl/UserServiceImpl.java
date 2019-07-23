package com.springboot.myblogtest3.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.springboot.myblogtest3.dao.UserMapper;
import com.springboot.myblogtest3.pojo.User;
import com.springboot.myblogtest3.service.IUserService;
import com.springboot.myblogtest3.util.MyResponse;


@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public MyResponse insertUser(User user) {
		String sql = "insert into t_user(userName, sex, note) values(?, ?,?)";
		int row = jdbcTemplate.update(sql, user.getUserName(), user.getSex(), user.getNote());

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

//		int row = iUserDao.insertUser(user);
//
//		MyResponse response = new MyResponse();
//
//		response.data = user;
//
//		if(row > 0) {
//
//			response.msg = "success";
//			response.status = 1;
//			return response;
//		}else {
//
//			response.msg = "failure";
//			response.status = 199;
//
//		}
		return response;
	}

	@Override
	public User getUser(Long id) {
		String sql = "select id, userName, sex, note from t_user where id = ?";
		return(User)jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(User.class));
	}
	@Override
	public List<User> listUser() {
		return null;
	}


}
