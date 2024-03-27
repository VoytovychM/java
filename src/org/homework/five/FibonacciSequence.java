package org.homework.five;

public class FibonacciSequence {
    private int number;

    public FibonacciSequence(int number) {
        if (number < 0) {
            System.out.println("You have entered negative number: Error");
        }
        this.number = number;

    }

    public FibonacciSequence() {
    }

    public int[] getFibonacciFor() {
        int[] fibonacci = new int[number];
        if (number >= 0) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

    public int[] getFibonacciWhile() {
        int[] fibonacci = new int[number];
        int firstElement = 0;
        int secondElement = 1;
        int i = 0;

        while (i < number) {
            fibonacci[i] = firstElement;
            int next = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = next;
            i++;
        }
        return fibonacci;
    }

    public int[] getFibonacciDoWhile() {
        int[] fibonacci = new int[number];
        int firstElement = 0;
        int secondElement = 1;
        int i = 0;
        do {
            fibonacci[i] = firstElement;
            int next = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = next;
            i++;
        } while (i < number);

        return fibonacci;
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

