package com.itstep.Lesson17.Classroom;

import java.util.Comparator;

public class AddressesByStringComparator implements Comparator<Address> {
    @Override
    public int compare(Address o1, Address o2) {
        return o1.getStreet().length()-o2.getStreet().length();

    }
}
