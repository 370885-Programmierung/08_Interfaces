package com.cc.java.bees;

import com.cc.java.interfaces.Flyable;

public abstract class HoneyBee implements Flyable{

    public abstract String doYourJob();

    public String nest() {
        return "Ich habe ein Nest aus Waben.";
    }
    
}
