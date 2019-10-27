package com.js.springdemo;

public class DrumCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public DrumCoach(FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30minutes on drumming practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
