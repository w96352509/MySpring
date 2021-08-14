<<<<<<< HEAD
package com.study.spring.case03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.study.spring.case03.dao.UserDao;
import com.study.spring.case03.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {
	
	//private UserDao userDao = new UserDaoImpl();
	
	// 自動裝配的順序 byType 再進行 byName
	@Autowired()
	@Qualifier(value="userDaoDerbyImpl")
	private UserDao userDao;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
	}

	@Override
	public void addUser() {
		userDao.createUser();
	}
}
=======
<<<<<<< HEAD
package com.study.spring.case03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.study.spring.case03.dao.UserDao;
import com.study.spring.case03.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {
	
	//private UserDao userDao = new UserDaoImpl();
	
	// 自動裝配的順序 byType 再進行 byName
	@Autowired()
	@Qualifier(value="userDaoDerbyImpl")
	private UserDao userDao;
	
	public UserServiceImpl() {
		System.out.println("UserServiceImpl()");
	}

	@Override
	public void addUser() {
		userDao.createUser();
	}
}
=======
package com.study.spring.case03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.study.spring.case03.dao.UserDao;
import com.study.spring.case03.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {
	
	//private UserDao  userDao = new UserDaoImpl();
	
	//自動裝配的順序 byType 在進行 byName
	
	@Autowired(required = false)
	@Qualifier(value="userDaoDerbyImpl")
	private UserDao  userDao;
	
	public UserServiceImpl() {
		System.out.println("UserService()");
	}

	@Override
	public void addUser() {
		userDao.createUser();
	}
}
>>>>>>> branch 'master' of git@github.com:w96352509/Spring0802.git
>>>>>>> refs/remotes/origin/master
