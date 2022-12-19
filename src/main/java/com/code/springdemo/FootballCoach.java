package com.code.springdemo;

public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Go practice penalty shootouts!";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
