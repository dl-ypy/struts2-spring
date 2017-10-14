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
		sql = "select * from t_users";
		RowMapper<UserModel> rowMapper = new BeanPropertyRowMapper<UserModel>(UserModel.class);
		return template.query(sql, rowMapper);
	}

	@Override
	public void save(UserModel user) throws RuntimeException {
		sql = "insert into t_users (userid,username,password,realname,deptid) values (seq_t_user.nextval,?,?,?,?)";
		template.update(sql, user.getUsername(), user.getPassword(),user.getRealname(),user.getDeptid());
	}

	@Override
	public void saveUserIdAndRoleId(Integer rid) throws RuntimeException {
		sql = "insert into t_users_role values (seq_t_user.currval,?)";
		template.update(sql, rid);
	}

}
