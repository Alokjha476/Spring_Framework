package com.springcore.expreaaionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con =new ClassPathXmlApplicationContext("com/springcore/expreaaionLanguage/expressionconfig.xml");
		Student std=con.getBean("student"  , Student.class);
		System.out.println(std);
	}

}
