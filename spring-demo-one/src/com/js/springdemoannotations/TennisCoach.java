package com.js.springdemoannotations;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach2 {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
