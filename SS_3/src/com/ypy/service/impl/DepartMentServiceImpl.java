package com.ypy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ypy.dao.IDepartMentDao;
import com.ypy.model.DepartMentModel;
import com.ypy.service.IDepartMentService;
@Service
public class DepartMentServiceImpl implements IDepartMentService {
	@Autowired
	private IDepartMentDao dao;
	@Override
	public List<DepartMentModel> query() {
		return dao.query();
	}

}
