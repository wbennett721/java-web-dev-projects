package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
