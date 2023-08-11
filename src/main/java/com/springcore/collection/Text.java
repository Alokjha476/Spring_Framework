package com.springcore.collection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
public static void main(String[] args) {
	//container obj
	ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
	Emp  emp1=(Emp) context.getBean("emp1");
	System.out.println(emp1.getEmpName());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getCourses());
	System.out.println(emp1.getPhones());
	System.out.println(emp1.getProps());
	
	}
}