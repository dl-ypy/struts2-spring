package com.ypy.model;

public class RoleModel {
	private int roleid;
	private String rolename;
	private String roledecx;
	@Override
	public String toString() {
		return "RoleModel [roleid=" + roleid + ", rolename=" + rolename + ", roledecx=" + roledecx + "]";
	}
	public RoleModel() {
		super();
	}
	public RoleModel(int roleid, String rolename, String roledecx) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.roledecx = roledecx;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRoledecx() {
		return roledecx;
	}
	public void setRoledecx(String roledecx) {
		this.roledecx = roledecx;
	}
}
