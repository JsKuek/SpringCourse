package com.js.springdemo;

public interface Coach {
	// so we can access coach class in a generic way(interface) or specifically
	public String getDailyWorkout();
	
	public String getDailyFortune();
}
