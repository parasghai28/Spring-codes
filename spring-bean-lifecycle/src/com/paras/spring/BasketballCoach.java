package com.paras.spring;

public class BasketballCoach implements Coach {

	private Diet diet;
	
	public BasketballCoach(Diet diet) {
		this.setDiet(diet);
	}
	
	@Override
	public String getWorkout() {
		return "shoot hoops";
	}

	public Diet getDiet() {
		return diet;
	}

	public void setDiet(Diet diet) {
		this.diet = diet;
	}

	public void startup() {
		System.out.println("some startup stuff");
	}
	
	public void shutdown() {
		System.out.println("some shutdown stuff");
	}
}
