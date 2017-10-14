package com.ypy.model;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
	private int userid;
	private String username;
	private String password;
	private String realname;
	private int deptid;
	private List<Integer> roleIds = new ArrayList<Integer>();
	
	public List<Integer> getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(List<Integer> roleIds) {
		this.roleIds = roleIds;
	}
	@Override
	public String toString() {
		return "UserModel [userid=" + userid + ", username=" + username + ", password=" + password + ", realname="
				+ realname + ", deptid=" + deptid + "]";
	}
	public UserModel() {
		super();
	}
	public UserModel(int userid, String username, String password, String realname, int deptid) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.deptid = deptid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
}
