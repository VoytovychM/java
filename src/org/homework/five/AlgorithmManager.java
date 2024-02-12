package org.homework.five;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmManager {
    public int[] getResultArray (int taskNumber, int cycleNumber, int number){


            switch (taskNumber) {
                case 1:

                    FibonacciSequence fibonacci = new FibonacciSequence(number);

                    switch (cycleNumber) {
                        case 1:
                            return fibonacci.getFibonacciWhile();

                        case 2:
                            return fibonacci.getFibonacciDoWhile();

                        case 3:
                            return fibonacci.getFibonacciFor();

                    }

                    break;

                case 2:


                    Factorial factorial = new Factorial(number);
                    switch (cycleNumber) {
                        case 1:
                            int [] whileArray = {factorial.getFactorialWhile()};
                            return whileArray;

                        case 2:
                            int[] doWhile = {factorial.getFactorialDoWhile()};
                            return doWhile;

                        case 3:
                            int[] forArray = {factorial.getFactorialFor()};
                            return forArray;

                    }

            }



        return null;
    }
}
