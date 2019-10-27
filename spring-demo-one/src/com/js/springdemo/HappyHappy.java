package com.js.springdemo;

import java.util.Random;

//this is the dependency library that we are injecting!!!!!!!! 
//this is specified in the configuration file(applicationContext.xml) as 
/**
 * <!-- define the dependency -->
 * <bean id="myFortuneService" class="com.js.springdemo.HappyHappy"></bean>
 *
 */
//when Fortune service is wanted, the defined getFortune() will be returned

public class HappyHappy implements FortuneService {

	@Override
	public String getFortune() {
		String[] arr = {"love fortune", "wealth fortune", "health fortune"};
		// TODO Auto-generated method stub
		return arr[new Random().nextInt(arr.length)];
	}

}
