package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = con.getBean("obj" , Student.class);
		System.out.println(student);
		System.out.println("________________________________");
		
		System.out.println(student.getAddress().getClass().getName());
	}
}
