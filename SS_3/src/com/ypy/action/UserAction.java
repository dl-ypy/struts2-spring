package com.ypy.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.ypy.model.DepartMentModel;
import com.ypy.model.RoleModel;
import com.ypy.model.UserModel;
import com.ypy.service.IDepartMentService;
import com.ypy.service.IRoleService;
import com.ypy.service.IUserService;
@Controller
public class UserAction extends ActionSupport implements ModelDriven<UserModel>{
	@Autowired
	private IUserService userService;
	@Autowired
	private IRoleService roleService;
	@Autowired
	private IDepartMentService departMentService;
	private List<UserModel> list;
	private List<RoleModel> roleList;
	private List<DepartMentModel> deptList;
	private UserModel model = new UserModel();
	
	
	public void setModel(UserModel model) {
		this.model = model;
	}

	public List<RoleModel> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<RoleModel> roleList) {
		this.roleList = roleList;
	}

	public List<DepartMentModel> getDeptList() {
		return deptList;
	}

	public void setDeptList(List<DepartMentModel> deptList) {
		this.deptList = deptList;
	}

	public List<UserModel> getList() {
		return list;
	}

	public void setList(List<UserModel> list) {
		this.list = list;
	}

	public String query() {
		list = userService.query();
		return SUCCESS;
	}
	
	public String queryAddPage() {
		roleList = roleService.query();
		deptList = departMentService.query();
		return "add";
	}
	
	public String save() {
		userService.save(model);
		return "save";
	}

	@Override
	public UserModel getModel() {
		return model;
	}
}
