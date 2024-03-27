package org.homework.five;

public class Factorial {
    private int number;

    public Factorial(int number) {
        if (number < 0) {
            System.out.println("You have entered negative number: Error");
        }

        this.number = number;

    }


    public Factorial() {

    }

    public int getFactorialDoWhile() {
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= number);
        return factorial;
    }

    public int getFactorialFor() {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial *= i;
        }
        return factorial;
    }

    public int getFactorialWhile() {
        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial = factorial * i;
            i++;
        }
        return factorial;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;

        } else {
            System.out.println("You have entered negative number: Error");
        }


    }


}




