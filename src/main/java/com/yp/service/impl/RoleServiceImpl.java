package com.yp.service.impl;

import com.yp.pojo.Role;
import com.yp.service.RoleService;

public class RoleServiceImpl implements RoleService{

	public void printRole(Role role) {
		 System.out.println("id="+role.getId()+"  "+"roleName"+role.getRoleName()+"  "+"note"+"   "+role.getNote());
 	}

}
