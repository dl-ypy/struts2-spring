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
		//�ȱ����û���Ϣ
		userDao.save(user);
		//�ٱ��浽�м��
		if (user.getRoleIds() != null) {
			for (Integer rid : user.getRoleIds()) {
				userDao.saveUserIdAndRoleId(rid);
			}
		}
	}

}
