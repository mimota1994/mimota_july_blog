package com.springboot.myblogtest3.main;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.myblogtest3.dao.IBlogDao;
import com.springboot.myblogtest3.dao.IUserDao;

@SpringBootApplication(scanBasePackages= {"com.springboot.myblogtest3"})
public class Myblog3Application {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory = null;
	
	@Bean
	public MapperFactoryBean<IUserDao> initIUserDao(){
		MapperFactoryBean<IUserDao> bean = new MapperFactoryBean<>();
		bean.setMapperInterface(IUserDao.class);
		bean.setSqlSessionFactory(sqlSessionFactory);
		return bean;
	}
	
	@Bean
	public MapperFactoryBean<IBlogDao> initIBlogDao(){
		MapperFactoryBean<IBlogDao> bean = new MapperFactoryBean<>();
		bean.setMapperInterface(IBlogDao.class);
		bean.setSqlSessionFactory(sqlSessionFactory);
		return bean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Myblog3Application.class, args);
	}

}
