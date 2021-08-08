package com.study.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Husband husband = (Husband) ctx.getBean("husband");
		Wife wife =(Wife)ctx.getBean("wife");
		System.out.printf("%s的老公是%s\n",husband.getName(),husband.getWife().getName());
System.out.println(wife.getName()+wife.getHusband().getName());
	}

}
