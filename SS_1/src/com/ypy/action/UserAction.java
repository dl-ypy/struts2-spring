package com.ypy.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.ypy.model.UserModel;
import com.ypy.service.IUserService;

public class UserAction extends ActionSupport{
	private IUserService service;
	private List<UserModel> list;
	
	public List<UserModel> getList() {
		return list;
	}

	public void setList(List<UserModel> list) {
		this.list = list;
	}

	public void setService(IUserService service) {
		this.service = service;
	}

	public String query() {
		list = service.query();
		return SUCCESS;
	}
}
