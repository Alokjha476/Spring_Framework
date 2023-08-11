package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
//		Samosa s=(Samosa) context.getBean("s1");
//		System.out.println(s);
		context.registerShutdownHook();  // to destroy method
		
//		System.out.println("*******************************");
//		
//		Pepsi p =(Pepsi)context.getBean("p1");
//		System.out.println(p);
		
		Example e = (Example) context.getBean("example");
		System.out.println(e);
		
	}

}
