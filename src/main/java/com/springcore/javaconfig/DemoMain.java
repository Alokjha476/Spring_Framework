package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student student=con.getBean("getStudent",Student.class);
		student.study();
		
	}

}
