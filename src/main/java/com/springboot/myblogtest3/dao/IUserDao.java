package com.springboot.myblogtest3.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.springboot.myblogtest3.pojo.User;

@Repository
public interface IUserDao {
	int insertUser(User user);
	
	User getUser(Long id);
	
	List<User> listUser();

	int createNewTable(@Param("tableName")String tableName) throws Exception;
}
