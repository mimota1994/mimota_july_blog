package com.springboot.myblogtest3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.myblogtest3.pojo.User;
import com.springboot.myblogtest3.service.IUserService;
import com.springboot.myblogtest3.util.MyResponse;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService iUserService = null;
	
	@RequestMapping("/add")
	public MyResponse<User> addUser(User user) {
		return iUserService.insertUser(user);
	}
	
	@RequestMapping("/get")
	public MyResponse<User> getUser(Long id) {
		return iUserService.getUser(id);
	}
	
	@RequestMapping("/list")
	public MyResponse<List<User>> listUser() {
		return iUserService.listUser();
	}

	@RequestMapping("/addTable")
	public MyResponse addUserTable() {
		return iUserService.createNewTable();
	}
}
