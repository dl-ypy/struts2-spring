package com.ypy.dao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ypy.model.UserModel;
import com.ypy.service.impl.UserServiceImpl;

public class UserDaoImplTest {

	@Test
	public void test() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl dao = ac.getBean(UserServiceImpl.class);
		List<UserModel> list = dao.query();
		System.out.println(list);
	}

}
