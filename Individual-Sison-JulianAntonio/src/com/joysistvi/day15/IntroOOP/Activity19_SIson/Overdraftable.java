package com.joysistvi.day15.IntroOOP.Activity19_SIson;

public interface Overdraftable {
    double OVERDRAFT_LIMIT = 2000;
    boolean isWithinOverdraft(double amount);
}
