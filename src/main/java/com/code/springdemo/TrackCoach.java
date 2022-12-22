package com.code.springdemo;

public class TrackCoach implements Coach {
    private FortuneService myFortune;

    public TrackCoach(){

    }
    public TrackCoach(FortuneService myFortune) {
        this.myFortune = myFortune;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it! " + myFortune.getFortune();
    }

    //init method
    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside doMyStartupStuff method");
    }
    //destroy method
    public void doMyCleanUpStuff(){
        System.out.println("TrackCoach: inside doMyCleanUpStuff method");
    }
}
