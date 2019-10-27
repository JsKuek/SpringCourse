package com.js.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
		
		// get the bean from spring container
		CoachAnnotations theCoach = context.getBean("thatSillyCoach", CoachAnnotations.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout()); 
		
		// close the context
		context.close();
	}

}