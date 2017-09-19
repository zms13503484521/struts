package com.zhiyou.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	
	public void validate(){
		if(username==null || "".equals(username.trim())){
			super.addFieldError("username", "用户名不能为空");
		}
	}
	
	@Override
	public String execute() throws Exception {
		if("hello".equals(username) && "123".equals(password)){
			return SUCCESS;
		}else if("你好".equals(username) && "123".equals(password)){
			
			super.addActionError("用户名或密码错误");
			return INPUT;
		}
		return "error";
	}
 

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
