package de.phil.primzahlen;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("Which limit?");
    draw(new Scanner(System.in).nextInt());
  }


  private static void draw(int limit) {
    boolean[] gestrichen = new boolean[limit];
    
    gestrichen[0] = gestrichen[1] = true;

    int p = 2;

    while (p < limit) {

      int sqrt = p * p;

      while (sqrt < limit) {
        gestrichen[sqrt] = true;
        sqrt += p;
      }

      p++;
    }

    int count = 0;

    for (int i = 0; i < limit; i++) {
      if (gestrichen[i]) continue;

      if (count % 10 == 0) {
        System.out.println();
        if (i < 10)
          System.out.printf("  %d ", i);
        else if (i >= 10 && i < 100)
          System.out.printf(" %d ", i);
      } else {
        if (i < 10)
          System.out.printf("  %d ", i);
        else if (i >= 10 && i < 100)
          System.out.printf(" %d ", i);
      }

      count++;
    }

    System.out.println();
  }
}