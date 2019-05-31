package com.springboot.myblogtest3.common;

public class ComResponse<T> {
	
	public int code;
	
	public String msg;
	
	public T data;
	
	public boolean isSuccess() {
		if(this.code == 0) {
			return true;
		}else {
			return false;
		}
	}

}
