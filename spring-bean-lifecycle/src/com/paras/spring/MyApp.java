package com.paras.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach1 = context.getBean("basketballCoach", Coach.class);
		Coach coach2 = context.getBean("basketballCoach", Coach.class);
		System.out.println(coach1 == coach2);
	}
}
