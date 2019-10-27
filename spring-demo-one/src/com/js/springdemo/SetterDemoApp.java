package com.js.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		MusicCoach theCoach = context.getBean("myCoach3", MusicCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println("my today fortune is: " + theCoach.getDailyFortune());
		
		// call our new methods to get literal values (new)
		System.out.println(theCoach.getEmailAdress());
		System.out.println(theCoach.getTeam());
		
		// close the context
		context.close();
		
	}

}
