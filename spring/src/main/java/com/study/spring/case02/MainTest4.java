<<<<<<< HEAD
package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest4 {

	public static void main(String[] args) {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Car car1 = (Car)ctx.getBean("carFactory");
		System.out.println(car1);
		Car car2 = (Car)ctx.getBean("carFactory");
		System.out.println(car2);
	}

}
=======
<<<<<<< HEAD
package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest4 {

	public static void main(String[] args) {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Car car1 = (Car)ctx.getBean("carFactory");
		System.out.println(car1);
		Car car2 = (Car)ctx.getBean("carFactory");
		System.out.println(car2);
	}

}
=======
package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest4 {

	public static void main(String[] args) {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext2.xml");
	    Car car =(Car)ctx.getBean("carFactory");
	    System.out.println(car);
	    Car car2 =(Car)ctx.getBean("carFactory");
	    System.out.println(car2);
		
		
	}

}
>>>>>>> branch 'master' of git@github.com:w96352509/Spring0802.git
>>>>>>> refs/remotes/origin/master
