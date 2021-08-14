<<<<<<< HEAD
package com.study.spring.case03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.case03.service.UserService;
import com.study.spring.case03.service.UserServiceImpl;

@Controller
public class UserController {
	
	//private UserService userService = new UserServiceImpl();
	
	@Autowired
	private UserService userService;
	
	
	public UserController() {
		System.out.println("UserController()");
	}
	
	public void appendUser() {
		userService.addUser();
	}
	
}
=======
package com.study.spring.case03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.study.spring.case03.service.UserService;
import com.study.spring.case03.service.UserServiceImpl;

@Controller
public class UserController {
	
	//private UserService service = new UserServiceImpl();
	
	@Autowired
	private UserService userService;
	
	public UserController() {
		System.out.println("UserController()");
	}
	public void appendUser() {
		userService.addUser();
	}
}
>>>>>>> branch 'master' of git@github.com:w96352509/Spring0802.git
