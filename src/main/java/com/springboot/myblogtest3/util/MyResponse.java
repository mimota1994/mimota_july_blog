package com.springboot.myblogtest3.util;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.springboot.myblogtest3.util.common.Status;
import lombok.Data;


@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class MyResponse<T>{
	
	private Integer status;
	private String msg;
	private T data;

	public static MyResponse createSuccessMessage(String msg){
		MyResponse response = new MyResponse();
		response.msg = msg;
		response.status = Status.SUCCESS;
		return response;
	}

	public static MyResponse createSuccess(){
		MyResponse response = new MyResponse();
		response.status = Status.SUCCESS;
		return response;
	}

	public static <T> MyResponse<T> createSuccessByDataAndMessage(String msg, T data){
		MyResponse<T> response = new MyResponse();
		response.status = Status.SUCCESS;
		response.msg = msg;
		response.data = data;
		return response;
	}

	public static <T> MyResponse<T> createSuccessByData(T data){
		MyResponse<T> response = new MyResponse();
		response.status = Status.SUCCESS;
		response.data = data;
		return response;
	}

	public static MyResponse createFailure(){
		MyResponse response = new MyResponse();
		response.status = Status.FAIL;
		return response;
	}

	public static MyResponse createFailureByMsg(String msg){
		MyResponse response = new MyResponse();
		response.msg = msg;
		response.status = Status.FAIL;
		return response;
	}

}
