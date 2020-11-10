package de.phil.controll_structures;

/**
 * @author Phil
 */

public class TwoDigitToString {

    private static final String[] ONES = new String[] {
       "eins", "zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun"
    };

    private static final String[] TENS = new String[] {
       "zwanzig", "dreißig", "vierzig", "fünfzig", "sechszig", "siebzig", "achtzig", "neunzig"
    };

    public String twoDigit2String(int zahl) {
        String result = "";

        if (!(zahl >= 20 && zahl <= 99)) {
            result = "Eingabe unzulässig!";
            return result;
        }

        String number = String.valueOf(zahl);
        String[] digits = number.split("(?=\\d)");

        int lastDigit = Integer.parseInt(digits[1]);
        int firstDigit = Integer.parseInt(digits[0]);

        if (lastDigit > 0) {
            result += ONES[lastDigit - 1];
            result += "und";
        }

        result += TENS[firstDigit - 2];

        return result;
    }

}
