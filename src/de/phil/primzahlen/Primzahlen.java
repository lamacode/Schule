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

      int k = p * p;

      while (k < limit) {
        gestrichen[k] = true;
        k += p;
      }

      p++;
    }

    int count = 0;

    for (int i = 0; i < limit; i++) {
      if (gestrichen[i]) continue;

      if (count % 10 == 0)
        System.out.println();
      
      int length = String.valueOf(limit).length();
      System.out.printf("%" + (length + 1) + "d", i);

      count++;
    }

    System.out.println();
  }
}
