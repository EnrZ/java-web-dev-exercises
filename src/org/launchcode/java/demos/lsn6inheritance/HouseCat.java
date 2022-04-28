package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String aName) {
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }


    //7.3 When overriding a method from a base class, the method signatures must be exactly the same
    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
