<<<<<<< HEAD
package com.study.spring.case03.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("UserDaoImpl()");
	}

	@Override
	public void createUser() {
		System.out.println("Create user ok!");
	}
}
=======
<<<<<<< HEAD
package com.study.spring.case03.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("UserDaoImpl()");
	}

	@Override
	public void createUser() {
		System.out.println("Create user ok!");
	}
}
=======
package com.study.spring.case03.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("UserDao()");
	}

	@Override
	public void createUser() {
		System.out.println("Create User ok");
		
	}
}
>>>>>>> branch 'master' of git@github.com:w96352509/Spring0802.git
>>>>>>> refs/remotes/origin/master
