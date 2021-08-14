package com.study.spring.case2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest4 {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
	Car car = (Car)ctx.getBean("carFactory");
	System.out.println(car);
	

	}

}
