package com.cc.java.birds;

import com.cc.java.interfaces.Flyable;
import com.cc.java.interfaces.IFeathers;

public class Bird implements  IFeathers,Flyable{

    @Override
    public String fly() {
        return "I'm a bird, I can also fly!";
    }

    @Override
    public String hasFeathers() {
        return "I'm a bird, I can fly and I have feathers!";
    }
    
}
