package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        if (o1.getCost() - o2.getCost() < 0){
            //it only matters that its negative int, not actual value
            return -100;
        } else if (o1.getCost() - o2.getCost() > 0) {
            return 100;
        } else {
            return 0;
        }
    }
}
