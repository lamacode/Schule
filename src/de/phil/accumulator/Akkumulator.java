package de.phil.accumulator;

/**
 * @author Phil
 */

public class Akkumulator {

    private double summe;
    private double quadratsumme;
    private double minimum;
    private double maximum;

    private int anzahl;

    public Akkumulator() {
        summe = 0;
        anzahl = 0;
    }

    public double getSumme() {
        return summe;
    }

    public double getQuadratsumme() {
        return quadratsumme;
    }

    public double getMinimum() {
        return minimum;
    }

    public double getMaximum() {
        return maximum;
    }

    public double getSpannweite() {
        return maximum - minimum;
    }

    public double getVarianz() {
        return (((1D / 5D) * quadratsumme)) - ((1D / 25D) * (summe * summe));
    }

    public double calcMittel() {
        return maximum / minimum;
    }

    public void aktualisiere(double wert) {
        summe += wert;
        quadratsumme += (wert * wert);
        anzahl++;

        if (wert > maximum || anzahl == 1)
            maximum = wert;
        if (wert < minimum || anzahl == 1)
            minimum = wert;
    }

    public void insert() {
        aktualisiere(4D);
        aktualisiere(3D);
        aktualisiere(8D);
        aktualisiere(11D);
        aktualisiere(5D);
    }
}
