package com.code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] fortunesStrings = {"This day you will progress!",
            "This day you will stagnate!",
            "This day you will regress!"};

    public RandomFortuneService(){
    }

    @Override
    public String getFortune() {
        int rng = 0;
        Random random  = new Random();
        rng = random.nextInt(2);
        return fortunesStrings[rng];
    }
}
