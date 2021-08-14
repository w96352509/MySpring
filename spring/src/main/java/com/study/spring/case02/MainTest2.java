<<<<<<< HEAD
package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student s1 = (Student)ctx.getBean("student1");
		System.out.println(s1);
		
		
	}

}
=======
<<<<<<< HEAD
package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student s1 = (Student)ctx.getBean("student1");
		System.out.println(s1);
		
		
	}

}
=======
package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student s1 = (Student)ctx.getBean("student1");
		System.out.println(s1);
		
		
	}

}
>>>>>>> branch 'master' of git@github.com:w96352509/Spring0802.git
>>>>>>> refs/remotes/origin/master
