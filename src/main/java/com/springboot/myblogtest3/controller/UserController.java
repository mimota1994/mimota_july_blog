package com.springboot.myblogtest3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.myblogtest3.pojo.User;
import com.springboot.myblogtest3.service.IUserService;
import com.springboot.myblogtest3.util.MyResponse;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private IUserService iUserService = null;
	
	@RequestMapping("/add")
	@ResponseBody
	public MyResponse addUser(User user) {
		return iUserService.insertUser(user);
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public User getUser(Long id) {
		return iUserService.getUser(id);
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> listUser() {
		return iUserService.listUser();
	}
	
	
}
