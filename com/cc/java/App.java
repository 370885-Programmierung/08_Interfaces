
package com.cc.java;

import com.cc.java.bees.*;
// import com.cc.java.bees.Drone;
// import com.cc.java.bees.Queen;
// import com.cc.java.bees.Worker;
import com.cc.java.birds.Bird;

public class App {
    
    public static void main(String[] args) {
    
        Worker worker = new Worker();
        Queen queen = new Queen(); 
        Drone drone = new Drone(); 
        Bird bird = new Bird();

        output(worker.doYourJob());
        output(queen.doYourJob());
        output(drone.doYourJob());

        output("-----------------");

        output(worker.fly());
        output(queen.fly());
        output(drone.fly());
        output(bird.fly());

        output(bird.hasFeathers());

        output(worker.nest());
        output(queen.nest());
        output(drone.nest());




    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

