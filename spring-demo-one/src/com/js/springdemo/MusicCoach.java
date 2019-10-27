package com.js.springdemo;

public class MusicCoach implements Coach{
	
	private FortuneService myFs;

	// add new fields fr emailAddress and team 
	private String emailAdress; // (new)
	private String team; // (new)
	
	// (new)
	public String getEmailAdress() { 
		return emailAdress;
	}

	// (new)
	public void setEmailAdress(String emailAdress) {
		System.out.println("MusicCoach : inside setter method - setEmailAdress");
		this.emailAdress = emailAdress;
	}
		
	// (new)
	public String getTeam() {
		return team;
	}

	// (new)
	public void setTeam(String team) {
		System.out.println("MusicCoach : inside setter method - setTeam");
		this.team = team;
	}
	
	// create a no-arg constructor
	public MusicCoach(){
		System.out.println("MusicCoach : inside no-arg constructor");
	}
		
	// our setter method used by Spring 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("MusicCoach : inside setter method - setFortuneService");
		this.myFs = fortuneService;
	}
		
	@Override
	public String getDailyWorkout() {
		return "Sing K for 6 hours";
	}

	@Override
	public String getDailyFortune() {
		return myFs.getFortune();
	}

}
