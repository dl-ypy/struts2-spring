package com.ypy.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ypy.dao.IUserDao;
import com.ypy.model.UserModel;

public class UserDaoImpl implements IUserDao {
	private JdbcTemplate template;
	private String sql;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<UserModel> query() {
		sql = "select * from t_user";
		RowMapper<UserModel> rowMapper = new BeanPropertyRowMapper<UserModel>(UserModel.class);
		return template.query(sql, rowMapper);
	}

}
