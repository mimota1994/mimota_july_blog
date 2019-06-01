package com.springboot.myblogtest3.common;

public class ComResponse<T> {
	
	public int code;
	
	public String msg;
	
	public T data;
	
	public boolean isSuccess() {
		if(this.code == ResponseStatus.CORRECT.code) {
			return true;
		}else {
			return false;
		}
	}

	public ComResponse(int code , String msg){
		this.code = code;
		this.msg = msg;
	}

	public ComResponse(int code){
		this.code = code;
	}

	public ComResponse(int code, String msg, T data){
		this.code = code;
		this.msg = msg;
		this.data = data;
	}



}
