package com.js.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService myFs;
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.myFs = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "run 24K";
	}

	@Override
	public String getDailyFortune() {
		return "Try not to run, you might fall --- in love with someone!";
	}
	
	// add an init method
	public void doMyStartup() {
		System.out.println("TrackCoach: inside method doMyStartUp");
	}
	
	// add a destroy method 
	public void doMyCleanUp() {
		System.out.println("TrackCoach: inside method doMyCleanUp");
	}
}
