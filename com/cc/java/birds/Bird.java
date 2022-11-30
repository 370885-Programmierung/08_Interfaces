package com.cc.java.birds;

import com.cc.java.bees.HoneyBee;
import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.IFeathers;

public class Bird extends HoneyBee implements Flyable, IFeathers{

    @Override
    public String doYourJob() {
        return "But I'm a bird!!!!!!";
    }

    @Override
    public String fly() {
        return "I'm a bird, I can also fly!";
    }

    @Override
    public String hasFeathers() {
        // TODO Auto-generated method stub
        return "I'm a bird, I can fly and I have feathers!";
    }
    
}
