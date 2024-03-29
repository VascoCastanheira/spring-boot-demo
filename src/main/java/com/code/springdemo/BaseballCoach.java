package com.code.springdemo;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService){
        this.fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        //usage of my dependency injection with fortuneService method
        return fortuneService.getFortune();
    }
}
