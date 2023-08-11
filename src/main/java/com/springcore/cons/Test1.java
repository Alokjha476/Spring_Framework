
package com.springcore.cons;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/cons/ciconfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		Addition add = (Addition) context.getBean("addition");
		add.sum();
	}

}
