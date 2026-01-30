package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Queen queen = new Queen();
        Worker worker = new Worker();
        Drone drone = new Drone();   

        /* 1. Iteration  */

        output(queen.doYourJob());
        output(queen.fly());
        output("-------------------");

        output(worker.doYourJob());
        output(worker.fly());
        output("-------------------");

        output(drone.doYourJob());
        output(drone.fly());
        output("-------------------");	

        
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

