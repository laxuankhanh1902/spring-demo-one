package com.luv2code.springdemo;

import java.util.Random;

public class MyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String[] fortunes = {"Wheel", "Tire", "Door"};
        return getRandom(fortunes);
    }

    private String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
}
