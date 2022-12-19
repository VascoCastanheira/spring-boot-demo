package com.code.springdemo;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach(){
        System.out.println("CricketCoach: iside no-arg constructor");
    }

//    public CricketCoach(String emailAddress, String team){
//        this.emailAddress = emailAddress;
//        this.team = team;
//    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside the setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
