package com.springboot.myblogtest3.pojo;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias(value = "blog")
public class Blog implements Serializable{
	
	Integer id;
	
	String title;
	
//	List<String> tags;
	
	String content;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}

}
