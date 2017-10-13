package com.ypy.service.impl;

import java.util.List;

import com.ypy.dao.IUserDao;
import com.ypy.model.UserModel;
import com.ypy.service.IUserService;

public class UserServiceImpl implements IUserService {
	private IUserDao dao;

	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

	@Override
	public List<UserModel> query() {
		return dao.query();
	}

}
