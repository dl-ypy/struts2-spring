package com.ypy.service;

import java.util.List;

import com.ypy.model.UserModel;

public interface IUserService {
	List<UserModel> query();
	void save(UserModel user) throws RuntimeException;
}
