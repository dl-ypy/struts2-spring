package com.ypy.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.ypy.model.UserModel;
import com.ypy.service.IUserService;
@Controller
public class UserAction extends ActionSupport{
	@Autowired
	private IUserService service;
	private List<UserModel> list;
	
	public List<UserModel> getList() {
		return list;
	}

	public void setList(List<UserModel> list) {
		this.list = list;
	}

	public String query() {
		list = service.query();
		return SUCCESS;
	}
}
