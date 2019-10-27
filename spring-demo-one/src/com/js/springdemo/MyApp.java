package com.js.springdemo;

public class MyApp {

	private static FortuneService myFortuneService;
	
	public static void main(String[] args) {
		Coach theCoach = new DrumCoach(myFortuneService);
		Coach theCoach2 = new TrackCoach();
		Coach theCoach3 = new MusicCoach();
		 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach3.getDailyFortune() + "+" + theCoach3.getDailyWorkout());
	}

}
