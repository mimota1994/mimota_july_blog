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
		}else {
			response.msg = "failure";
			response.status = 199;
		}
		return response;
	}

	@Override
	public MyResponse getUser(Long id) {
		String sql = "select id, userName, sex, note from t_user where id = ?";
		MyResponse response = new MyResponse();

		try{
			User user = (User)jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper(User.class));
			response.msg = "success";
			response.status = 1;
			response.data = user;
		}catch (Exception e){
			response.msg = "failure";
			response.status = 199;
		}

		return response;
	}

	@Override
	public MyResponse listUser() {
		String sql = "select id, userName, sex, note from t_user";
		List<User> users = (List<User>)jdbcTemplate.query(sql, new BeanPropertyRowMapper(User.class));
		MyResponse response = new MyResponse();
		response.msg = "success";
		response.status = 1;
		response.data = users;

		return response;
	}

	@Override
	public MyResponse deleteUser(int id) {
		String sql = "delete from t_user where id = ?";
		int row = jdbcTemplate.update(sql, id);
		MyResponse response = new MyResponse();

		if(row > 0) {
			response.msg = "success";
			response.status = 1;
		}else {
			response.msg = "failure";
			response.status = 199;
		}
		return response;
	}


}
