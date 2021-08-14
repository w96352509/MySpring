<<<<<<< HEAD
package com.study.spring.case03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.case03.controller.UserController;

public class UserTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
		UserController uc = ctx.getBean("userController", UserController.class);
		uc.appendUser();

	}

}
=======
<<<<<<< HEAD
package com.study.spring.case03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.case03.controller.UserController;

public class UserTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
		UserController uc = ctx.getBean("userController", UserController.class);
		uc.appendUser();

	}

}
=======
package com.study.spring.case03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.spring.case03.controller.UserController;

public class UserTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserController uc = ctx.getBean("userController",UserController.class);
        uc.appendUser();
	}

}
>>>>>>> branch 'master' of git@github.com:w96352509/Spring0802.git
>>>>>>> refs/remotes/origin/master
