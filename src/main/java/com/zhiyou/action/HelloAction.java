package com.zhiyou.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class HelloAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		return "test";
	}
}
