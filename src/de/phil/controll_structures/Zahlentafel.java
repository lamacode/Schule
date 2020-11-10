package de.phil.controll_structures;

/**
 * @author Phil
 */

public class Zahlentafel {

    public void zahlentafel(int ziffer) {
        if (ziffer < 2 || ziffer > 9)
            System.out.println("Bitte geben eine richtige Zahl ein!");

        int limit = 100;
        int i = 0;

        while(i < limit) {

            boolean contains = String.valueOf(i).contains(String.valueOf(ziffer));

            int line = 9;

            if (i % 10 == line) {
                System.out.printf("%s \n", (i % ziffer == 0 || contains ? "*" : String.valueOf(i)));
            } else {
                System.out.printf("%s ", (i % ziffer == 0 || contains ? "*" : String.valueOf(i)));
            }

            i++;
        }
    }

}
