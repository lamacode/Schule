package de.phil.controll_structures;

/**
 * @author Phil
 */

public class DreieckTest {

    public String dreieckTest(int a, int b, int c) {
        if (c > a + b)
            return "Nicht Konstruierbar, da Seite c zu lang!";
        else if (b > a + c)
            return "Nicht Konstruierbar, da Seite b zu lang!";
        else if (a > b + c)
            return "Nicht Konstruierbar, da Seite a zu lang!";
        else
            return "Konstruierbar";
    }

}
