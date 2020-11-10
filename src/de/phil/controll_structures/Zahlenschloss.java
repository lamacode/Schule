package de.phil.controll_structures;

/**
 * @author Phil
 */

public class Zahlenschloss {

    private int digitOne;
    private int digitTwo;
    private int digitThree;

    public void generateNumber() {
        digitThree++;

        if (digitThree > 9) {
            digitThree = 0;
            digitTwo++;

            if (digitTwo > 9) {
                digitTwo = 0;

                if (digitOne < 9)
                    digitOne++;
            }
        }
    }

    public void printGeneratedNumbers() {
        boolean finish = false;
        int increment = 0;

        while (!finish) {
            increment++;

            generateNumber();

            boolean equal = false;

            while (!equal) {
                if (digitOne == digitTwo)
                    generateNumber();
                else if (digitTwo == digitThree)
                    generateNumber();
                else if (digitOne == digitThree)
                    generateNumber();

                if (digitOne != digitTwo && digitTwo != digitThree && digitOne != digitThree)
                    equal = true;
            }


            if (increment % 10 == 0)
                System.out.printf("%d%d%d \n", digitOne, digitTwo, digitThree);
            else
                System.out.printf("%d%d%d ", digitOne, digitTwo, digitThree);

            if (digitOne == 9 && digitTwo == 8 && digitThree == 7)
                finish = true;
        }

        digitOne = 0;
        digitTwo = 0;
        digitThree = 0;
    }

}
