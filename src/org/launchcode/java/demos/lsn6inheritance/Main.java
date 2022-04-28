package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    //psvm
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);

        //The eat method was defined in Cat, but may be called on all HouseCat instances as well. We say: “HouseCat inherits the method eat() from Cat.
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        //weight is 13 from no arg constructor
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13

    }

}
