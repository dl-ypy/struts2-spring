package com.ypy.dao.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ypy.dao.IRoleDao;
import com.ypy.model.RoleModel;
@Repository
public class RoleDaoImpl implements IRoleDao {
	@Autowired
	private JdbcTemplate template;
	private String sql;
	
	@Override
	public List<RoleModel> query() {
		sql = "select * from t_role";
		RowMapper<RoleModel> rowMapper = new BeanPropertyRowMapper<RoleModel>(RoleModel.class); 
		return template.query(sql, rowMapper);
	}

}
