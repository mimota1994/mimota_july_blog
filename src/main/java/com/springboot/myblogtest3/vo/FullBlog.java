package com.springboot.myblogtest3.vo;

import com.springboot.myblogtest3.pojo.Blog;

public class FullBlog extends Blog{
	
	String introduction;
	
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	public String getIntroduction() {
		return introduction;
	}

}
