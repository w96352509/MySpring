package com.study.spring.case2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
	Student s1 =(Student)ctx.getBean("student1");
	System.out.println(s1);
	((ClassPathXmlApplicationContext)ctx).close();

	}

}
