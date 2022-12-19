package com.code.springdemo;

public class HappyFortuneService implements FortuneService{

    private String theFortune;

    public HappyFortuneService(){
        System.out.println("HappyFortuneService: Inside the no-arg constructor");
    }

    public HappyFortuneService(String theFortune){

    }
    @Override
    public String getFortune() {
        return "Today your efforts will be rewarded!";
    }

    public String getTheFortune() {
        return theFortune;
    }

    public void setTheFortune(String theFortune) {
        this.theFortune = theFortune;
    }

}
