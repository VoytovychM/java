package org.homework.two;


import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double c = scanner.nextDouble();
      double volume = a * b * c;
        System.out.println("Volume of cube = " + volume );
    }
}
