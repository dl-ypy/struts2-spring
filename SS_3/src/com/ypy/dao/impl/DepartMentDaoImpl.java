package com.ypy.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ypy.dao.IDepartMentDao;
import com.ypy.model.DepartMentModel;
@Repository
public class DepartMentDaoImpl implements IDepartMentDao {
	@Autowired
	private JdbcTemplate template;
	private String sql;
	
	@Override
	public List<DepartMentModel> query() {
		sql = "select * from t_basic";
		RowMapper<DepartMentModel> rowMapper = new BeanPropertyRowMapper<DepartMentModel>(DepartMentModel.class);
		return template.query(sql, rowMapper);
	}

}
