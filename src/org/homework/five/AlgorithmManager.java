package org.homework.five;

public class AlgorithmManager {
    public int[] getResultArray (int taskNumber, int cycleNumber, int number){

        int[] result = null;

            switch (taskNumber) {
                case 1:
                    result = runFibonacciSequence(cycleNumber, number);
                    break;
                case 2:
                    result = runFactorial(cycleNumber, number);
                    break;
            }
        return result;
    }

    private int[] runFibonacciSequence(int cycleNumber, int number) {
        FibonacciSequence fibonacci = new FibonacciSequence(number);
        switch (cycleNumber) {
            case 1:
                return fibonacci.getFibonacciWhile();

            case 2:
                return fibonacci.getFibonacciDoWhile();

            case 3:
                return fibonacci.getFibonacciFor();

        }
        return null;
    }

    private int[] runFactorial(int cycleNumber, int number) {
        Factorial factorial = new Factorial(number);
        switch (cycleNumber) {
            case 1:
                int[] whileArray = {factorial.getFactorialWhile()};
                return whileArray;

            case 2:
                int[] doWhile = {factorial.getFactorialDoWhile()};
                return doWhile;

            case 3:
                int[] forArray = {factorial.getFactorialFor()};
                return forArray;
        }
        return null;
}
}