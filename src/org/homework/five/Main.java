package org.homework.five;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Factorial factorial = new Factorial(9);
        int doWileFactorial = factorial.getFactorialDoWhile();
        int forFactorial = factorial.getFactorialFor();
        int whileFactorial = factorial.getFactorialWhile();
        System.out.println("Value of Factorial via do while is: " + doWileFactorial);
        System.out.println("Value of Factorial via while is: " + whileFactorial);
        System.out.println("Value of Factorial via for is: " + forFactorial);


        factorial.setNumber(-1);

        doWileFactorial = factorial.getFactorialDoWhile();
        forFactorial = factorial.getFactorialFor();
        whileFactorial = factorial.getFactorialWhile();
        System.out.println("Value of Factorial via do while is: " + doWileFactorial);
        System.out.println("Value of Factorial via while is: " + whileFactorial);
        System.out.println("Value of Factorial via for is: " + forFactorial);

        FibonacciSequence fibonacciSequence = new FibonacciSequence(9);
        int[] doWhileFibonacci = fibonacciSequence.getFibonacciDoWhile();
        int[] whileFibonacci = fibonacciSequence.getFibonacciWhile();
        int[] forFibonacci = fibonacciSequence.getFibonacciFor();
        System.out.println("Value of Fibonacci via do while is: " + Arrays.toString(doWhileFibonacci));
        System.out.println("Value of Fibonacci via while is: " + Arrays.toString(whileFibonacci));
        System.out.println("Value of Fibonacci via for is: " + Arrays.toString(forFibonacci));

        fibonacciSequence.setNumber(-2);
        doWhileFibonacci = fibonacciSequence.getFibonacciDoWhile();
        whileFibonacci = fibonacciSequence.getFibonacciWhile();
        forFibonacci = fibonacciSequence.getFibonacciFor();
        System.out.println("Value of Fibonacci via do while is: " + Arrays.toString(doWhileFibonacci));
        System.out.println("Value of Fibonacci via while is: " + Arrays.toString(whileFibonacci));
        System.out.println("Value of Fibonacci via for is: " + Arrays.toString(forFibonacci));
    }

}
