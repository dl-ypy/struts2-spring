package com.ypy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ypy.dao.IUserDao;
import com.ypy.model.UserModel;
import com.ypy.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao userDao;
	@Override
	public List<UserModel> query() {
		return userDao.query();
	}
	@Override
	public void save(UserModel user) throws RuntimeException {
		//先保存用户信息
		userDao.save(user);
		//再保存到中间表
		if (user.getRoleIds() != null) {
			for (Integer rid : user.getRoleIds()) {
				userDao.saveUserIdAndRoleId(rid);
			}
		}
	}

}
