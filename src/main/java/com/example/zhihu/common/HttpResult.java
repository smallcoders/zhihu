/*
 *
 * Copyright (c) 2018. www.zhixue.com All rights Reserved.
 *
 */

/**
 * 
 */
package com.example.zhihu.common;

/**
 * Controller返回结果
 * @author kxzhang
 *
 */
public class HttpResult {

	private static final long serialVersionUID = 1547811901129089180L;

	private int code;
	private String msg;

	public HttpResult(){

	}
	
	public HttpResult(int code, String msg, Object data){
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public static HttpResult getSuccessInstance(){
		return new HttpResult(ResultCode.SUCCESS, "操作成功", "");
	}
	
	public static HttpResult getSuccessInstance(Object data){
		return new HttpResult(ResultCode.SUCCESS, "操作成功", data);
	}
	
	public static HttpResult getFailedInstance(){
		return new HttpResult(ResultCode.FAILED, "操作失败", "");
	}
	
	public static HttpResult getFailedInstance(String msg){
		return new HttpResult(ResultCode.FAILED, msg, "");
	}	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	private Object data;
	
}
