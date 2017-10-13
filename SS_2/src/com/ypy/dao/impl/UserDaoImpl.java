package com.ypy.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ypy.dao.IUserDao;
import com.ypy.model.UserModel;
@Repository
public class UserDaoImpl implements IUserDao {
	@Autowired
	private JdbcTemplate template;
	private String sql;
	
	@Override
	public List<UserModel> query() {
		sql = "select * from t_user";
		RowMapper<UserModel> rowMapper = new BeanPropertyRowMapper<UserModel>(UserModel.class);
		return template.query(sql, rowMapper);
	}

}
