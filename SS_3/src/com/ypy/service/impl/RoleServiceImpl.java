package com.ypy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ypy.dao.IRoleDao;
import com.ypy.model.RoleModel;
import com.ypy.service.IRoleService;
@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private IRoleDao dao;
	@Override
	public List<RoleModel> query() {
		return dao.query();
	}

}
