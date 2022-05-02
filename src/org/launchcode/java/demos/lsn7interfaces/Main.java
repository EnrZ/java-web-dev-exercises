package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // creating FlavorComparator obj
        Comparator comparator = new FlavorComparator();

        //ConeComparator object
        Comparator comparator2 = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        for(Flavor all : flavors) {
            System.out.println(all.getName());
        }

        //the flavorcomparator compare method with compareTo is what is sorting by name
        flavors.sort(comparator);

        for(Flavor all : flavors) {
            System.out.println(all.getName());
        }


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        for(Cone all : cones) {
            System.out.println(all.getName() + all.getCost());
        }

        cones.sort(comparator2);

        for(Cone all : cones) {
            System.out.println(all.getName() + all.getCost());
        }

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
