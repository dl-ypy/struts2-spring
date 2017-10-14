package com.ypy.model;

public class DepartMentModel {
	private int bid;
	private String name;
	private int pid;
	@Override
	public String toString() {
		return "DepartMentModel [bid=" + bid + ", name=" + name + ", pid=" + pid + "]";
	}
	public DepartMentModel() {
		super();
	}
	public DepartMentModel(int bid, String name, int pid) {
		super();
		this.bid = bid;
		this.name = name;
		this.pid = pid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
}
