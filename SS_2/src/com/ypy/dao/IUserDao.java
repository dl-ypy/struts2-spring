package com.ypy.dao;

import java.util.List;

import com.ypy.model.UserModel;

public interface IUserDao {
	List<UserModel> query();
}
