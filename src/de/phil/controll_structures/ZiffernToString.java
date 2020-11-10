package de.phil.controll_structures;

/**
 * @author lamacode
 * @since 10.11.2020 22:16
 * Copyright © 2020 | lamacode | All rights reserved.
 */

public class ZiffernToString {

    /**
     *
     */
    private static final String[] ONES = new String[] { "eins", "zwei", "drei" };

    /**
     *
     * @param ziffer
     * @return
     */
    public String ziffer2String(int ziffer) {
        if (!(ONES.length >= ziffer))
            return null;
        return ONES[ziffer - 1];
    }

}
