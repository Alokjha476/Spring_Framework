package com.springcore.standalon.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalon/collection/aloneconfig.xml");
		Person person1=(Person) con.getBean("person");
		System.out.println(person1);
		// check the class linked list or not
		System.out.println(person1.getFriends().getClass().getName());
		System.out.println("______________________________");
		System.out.println(person1.getFeesstructure());
		System.out.println(person1.getFeesstructure().getClass().getName());
		System.out.println("___________________");
		System.out.println(person1.getProperties());
		
	}

}
