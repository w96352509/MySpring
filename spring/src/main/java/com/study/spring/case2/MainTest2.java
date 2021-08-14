package com.study.spring.case2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
	Student s1 =(Student)ctx.getBean("student1");
	Student s2 =(Student)ctx.getBean("student2");
	Student s3 =(Student)ctx.getBean("student3");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	

	}

}
