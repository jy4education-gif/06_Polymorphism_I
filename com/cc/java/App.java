package com.cc.java;

public class App {
    
    public static void main(String[] args) {     // Signatur der Methode, die Java als universellen Einstiegspunkt
     
        Queen queen = new Queen();
        Worker worker = new Worker();            // Instanziierung, Keyword "new" -> Heap + Konstruktor z.b. "Worker()" der das Objekt "new Worker()" erzeugt
        Drone drone = new Drone();   

    //     /* 1. Iteration  */

    //     output(queen.doYourJob());
    //     output(queen.fly());
    //     output("-------------------");

    //     output(worker.doYourJob());
    //     output(worker.fly());
    //     output("-------------------");

    //     output(drone.doYourJob());
    //     output(drone.fly());
    //     output("-------------------");	

        pollObject(queen);
        pollObject(worker);
        pollObject(drone);
 
        //-- Das sollte eigentlich nicht gehen!--//
        HoneyBee bee = new HoneyBee(); // SuperKlasse!
        pollObject(bee);

    }

    /* 2. Iteration: überladene Methoden */

    // private static void pollObject(Queen obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");                  // pollObject: Overloading
    // }

    //  private static void pollObject(Worker obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");
    // }

    //  private static void pollObject(Drone obj){
    //     output(obj.doYourJob());
    //     output(obj.fly());
    //     output("-------------------");
    // }

    /* 3. Iteration: Polymorphie */

     private static void pollObject(HoneyBee obj){
        output(obj.doYourJob());
        output(obj.fly());
        output("-------------------");
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

