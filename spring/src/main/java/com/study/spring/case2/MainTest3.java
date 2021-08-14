package com.study.spring.case2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest3 {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
	Student s1 =(Student)ctx.getBean("student1");
	System.out.println(s1);
	Teacher t1 = (Teacher)ctx.getBean("teacher1");
	Teacher t2 = (Teacher)ctx.getBean("teacher2");
    System.out.println(t1);
	System.out.println(t2);
	System.out.println(t1.getTotalCreadits());
}

}
