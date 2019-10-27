package com.js.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file (create spring container)
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class); // the bean id, the interface
		Coach theCoach2 = context.getBean("myCoach2", Coach.class);
		Coach lastCoach = context.getBean("myCoach3", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune() +"\n");
		
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune()+"\n");
		
		System.out.println(lastCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
