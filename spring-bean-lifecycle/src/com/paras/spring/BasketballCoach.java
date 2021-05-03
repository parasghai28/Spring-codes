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

}
