package com.yp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yp.pojo.Role;
import com.yp.service.RoleService;

public class Chacpter11_2 {

	public static void main(String[] args) {
	 ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	 RoleService roleService=ac.getBean(RoleService.class);
	 Role role=new Role();
	 role.setId(1);
	 role.setRoleName("hah");
	 role.setNote("xixi");
	 roleService.printRole(role);
	}

}
