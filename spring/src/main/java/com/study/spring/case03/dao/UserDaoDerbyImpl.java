<<<<<<< HEAD
package com.study.spring.case03.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoDerbyImpl implements UserDao {

	public UserDaoDerbyImpl() {
		System.out.println("UserDaoDerbyImpl()");
	}

	@Override
	public void createUser() {
		System.out.println("Create user ok from derby !");
	}

}
=======
package com.study.spring.case03.dao;

import org.springframework.stereotype.Repository;

//OK
@Repository
public class UserDaoDerbyImpl implements UserDao {
	public UserDaoDerbyImpl() {
		System.out.println("UserDaoDerbyImpl()");
	}

	@Override
	public void createUser() {
		System.out.println("Create User ok from derby");
		
	}
}
>>>>>>> branch 'master' of git@github.com:w96352509/Spring0802.git
